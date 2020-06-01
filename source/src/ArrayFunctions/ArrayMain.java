package ArrayFunctions;

public class ArrayMain {

    public static void main(String[] args){

        Scores highScores = new Scores();

        GameEntry hugo = new GameEntry("Hugo", 89);
        GameEntry mike = new GameEntry("Mike", 90);
        GameEntry ethan = new GameEntry("Ethan", 94);

        highScores.addScore(hugo);
        highScores.addScore(mike);
        highScores.addScore(ethan);

        System.out.println(highScores.toString());
    }
}
