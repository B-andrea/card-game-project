package org.example;

// Keep track of players and score

public class Player {

    String name; // Player's name
    int score;
//    Is this player currently playing?
   private  boolean isPlaying;

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public Player(String name, boolean isPlaying) {
        this.name = name;
        this.score = 0;
        this.isPlaying = isPlaying;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        this.score++;
    }

}
