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


    //Sort deck in number order (22223333 etc) - Store the new shuffled deck into DeckOfCards.
    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparingInt(card -> card.getValue())); //(argument list) -> {body of lambda expression}
        return deckOfCards;
    }

    //sort deck by suit and return deck
    public ArrayList<Card> sortDeckIntoSuits() {
        ArrayList<Card> sortedCards = new ArrayList<>();


        deckOfCards.sort((card1, card2) -> {
            int suitComparison = card1.getSuit().compareTo(card2.getSuit());
            if (suitComparison != 0) {
                return suitComparison;
            }
            return Integer.compare(card1.getValue(), card2.getValue());


        });
        return deckOfCards;
    }

    //shuffle deck into random order
    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

}
