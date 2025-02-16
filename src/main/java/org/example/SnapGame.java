package org.example;

import java.util.Scanner;

public class SnapGame extends CardGame {
    Boolean isGameOver = false;
    Card previousCard;

    public SnapGame() {
        super("Snap");
    }

    public void playGame() {
        super.shuffleDeck();
        while (isGameOver == false) {
            System.out.println("Press enter to take your turn");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            Card nextCard = super.dealCard();
            System.out.println(nextCard);
            if (nextCard == null) {
                isGameOver = true;
            }

            else if (previousCard != null) {
                int symbolComparison = previousCard.getSymbol().compareTo(nextCard.getSymbol());
                if (symbolComparison == 0) {
                    isGameOver = true;
                    System.out.println("SNAP! You have won");
                }
            }

            previousCard = nextCard;
        }
    }
}
