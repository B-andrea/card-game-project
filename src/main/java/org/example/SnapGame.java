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

// Create the scanner object, using system out and prompting player to press enter
// name of scanner object.nextLine()
// System in, to identify that a user has pressed Enter

// Give them one card from the deck, using deal card method
// Check if there are any cards left. If no cards left, then game ends. Setting a variable 'isGameOver' to true.
// Compare the current card with the previous card
// If they are the same, then game ends. Setting a variable 'isGameOver' to true
// If they are not the same, store the card in the variable to indicate that this is the 'previous card'
// Then loop repeats itself
