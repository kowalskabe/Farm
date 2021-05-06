package Models;

public class ScoreBoard {
    private static ScoreBoard uniqueInstance = new ScoreBoard();



    public static ScoreBoard getInstance() {
        return uniqueInstance;
    }
}
