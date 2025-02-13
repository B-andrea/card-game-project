package org.example;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private final String suit;
    private final String symbol;
    private final int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }



    //Display each card as a string
    public String toString() {
        return symbol + suit;
    }
}
