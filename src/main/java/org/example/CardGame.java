package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    private ArrayList<Card> deckOfCards;
    String name;

    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        populateDeck();
        this.name = name;
    }


    // getDeck method that lists out the cards in the deck
    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }

    public String getName() {
        return name;
    }


    //populateDeck creates 52 card objects and adds them to deckOfCards
    private void populateDeck() {
        String[] suits = {"♥", "♣", "♦", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                deckOfCards.add(new Card(suit, symbols[i], values[i]));
            }
        }
    }


    //Takes the card from the top of the deck and returns it.
    public Card dealCard() {
        if (deckOfCards.isEmpty()) {
            System.out.println("No cards left");
            return null;
        } else {
            return deckOfCards.removeFirst(); // method of the ArrayList class to remove and return the first element
        }
    }


    //shuffle deck into random order
    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }











//    public void printDeck() {
//        for ( int i = 0; i < this.deckOfCards.size(); i++) {
//            Card cardRetrieved = this.deckOfCards.get(i);
//            String description = cardRetrieved.toString();
//            System.out.println(description);
//        }
//    }
}
