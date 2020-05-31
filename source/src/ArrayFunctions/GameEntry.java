package ArrayFunctions;
// a class for storing the high scores of a person and their score in a given game
public class GameEntry {

    protected String name;
    protected int score;

    // parametric constructor
    public GameEntry(String name, int score){
        this.name = name;
        this.score =score;
    }

    // class methods

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {

            return "Name: " + name + "\tScore: " + score;

    }



}
