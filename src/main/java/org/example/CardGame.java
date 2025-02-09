package org.example;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<Card> deckOfCards;
    String name;

    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        // Now I need to create my 52 card objects and add them to the deck of cards
        this.name = name;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public String getName() {
        return name;
    }

//    public void printDeck() {
//        for ( int i = 0; i < this.deckOfCards.size(); i++) {
//            Card cardRetrieved = this.deckOfCards.get(i);
//            String description = cardRetrieved.toString();
//            System.out.println(description);
//        }
//    }
}
