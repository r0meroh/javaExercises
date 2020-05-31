package ArrayFunctions;

public class Scores {
    public static final  int maxEntries = 10;
    protected int numEntries;
    protected GameEntry[] entries;

    // constructor
    public Scores(){
        entries = new GameEntry[maxEntries];
        numEntries = 0;
    }


    public String toString(){
        String s = "[" ;
        for(int x = 0; x < numEntries; x ++ ){
            if(x > x)s += ", ";
            s += entries[x];
        }
        return s + "]";
    }

    public void addScore(GameEntry ent){
        int newScore = ent.getScore();
        // check to see where it ranks
        if(numEntries == maxEntries){
            if(newScore <= entries[numEntries - 1].getScore())
            return; // returns nothing because the new entry is not considered a high score
        }else{
            numEntries++;
        }

        int x =numEntries - 1;
        for(;(x>=1)&&(newScore > entries[x-1].getScore());x--){
            entries[x] = entries[x-1];
        }
        entries[x] = ent;

    }

    // remove an entry
    public  GameEntry remove(int xx) throws IndexOutOfBoundsException{
        if((xx < 0)||(xx >= numEntries))
            throw new IndexOutOfBoundsException("Invalid index at [" + xx + "]");
        GameEntry temp = entries[xx];
        for(int j = xx; j < numEntries-1; j++){
            entries[j] = entries[j+1];
        }
        entries[numEntries - 1] = null;
        numEntries --;
        return temp; // returns the removed object
    }
}
