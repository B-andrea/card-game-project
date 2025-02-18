package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SnapGame extends CardGame {
    Boolean isGameOver = false; // track whether the game is finished
    Card previousCard; // store the previous card that was dealt, so that the next card can be compared to it
    Player player1; // enabling two players
    Player player2;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println("You missed the Snap! Game Over");
            isGameOver = true;
        }
    };

    public SnapGame() {
        super("Snap");
        player1 = new Player("Player 1", true);
        player2 = new Player("Player 2", false);
    }

    public void playGame() {
        super.shuffleDeck();
        while (isGameOver == false) {
            System.out.println(getCurrentPlayerName() + "s turn! Press enter to take your turn");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine(); // Wait for users input

            Card nextCard = super.dealCard(); // deal the card and store it in nextCard
            System.out.println(getCurrentPlayerName() + " picked up: " + nextCard);
            if (nextCard == null) {
                isGameOver = true;
                System.out.println("No cards left in the deck! Game Over");

            } else if (previousCard != null) {
                // Check for Snap - compare cards symbols
                int symbolComparison = previousCard.getSymbol().compareTo(nextCard.getSymbol());
                if (symbolComparison == 0) { // If even
                    System.out.println("SNAP! You have 2 seconds to type 'snap' to win!");
                    timer.schedule(task, 2000L);

                    String userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("snap")) {
                        timer.cancel(); // stop timer
                        getCurrentPlayer().addScore();
                        System.out.println(getCurrentPlayerName() + " wins the game! ");
                        isGameOver = true;
                    }

                }
            }
            // Update the previous card
            previousCard = nextCard;
            switchUser();
        }
    }

    // Users take turns
    public void switchUser() {
        if (player1.isPlaying()) {
            // Better to use setters and getters
            player1.setPlaying(false);
            player2.setPlaying(true);
        } else if (player2.isPlaying()) {
            player2.setPlaying(false);
            player1.setPlaying(true);
        }

    }

    public String getCurrentPlayerName() {
        if (player1.isPlaying()) return player1.getName();
        return player2.getName();
    }

    public Player getCurrentPlayer() {
        if (player1.isPlaying()) return player1;
        return player2;
    } // Return the current player object (instead of just the name) to execute methods like addScore
}


