package org.example;

import java.util.ArrayList;

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
        for(Card card : deckOfCards) {
            System.out.println(card);
        }
    }

    public String getName() {
        return name;
    }


    //populateDeck creates 52 card objects and adds them to deckOfCards
    private void populateDeck(){
        String[] suits = {"♥", "♣", "♦", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for(String suit:suits) {
            for (int i = 0; i < symbols.length; i++) {
                deckOfCards.add(new Card(suit, symbols[i], values[i]));
            }
        }
    }







//    public void printDeck() {
//        for ( int i = 0; i < this.deckOfCards.size(); i++) {
//            Card cardRetrieved = this.deckOfCards.get(i);
//            String description = cardRetrieved.toString();
//            System.out.println(description);
//        }
//    }
}
