package org.example;
import java.util.Scanner;

public class SnapGame extends CardGame {
    Boolean isGameOver = false; // track whether the game is finished
    Card previousCard; // store the previous card that was dealt, so that the next card can be compared to it
    Player player1; // enabling two players
    Player player2;
    Player currentPlayer; // keep track of which player is taking the current turn

    public SnapGame() {
        super("Snap");
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        currentPlayer = player1; // Player 1 starts - initialising currentPlayer variable to player1
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

        // Users take turns
        public void switchUser() {
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }


    }
}
