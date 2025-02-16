// Keep track of players and score

public class Player {

    String name; // Player's name
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
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
