package org.example;

public class Card {
    String symbol;
    String suit;
    int value;

    public Card(String symbol, String suit, int value) {
        this.symbol = symbol;
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return symbol + suit;
    }
}