package Progression_example;

public class Progression {

    // first value to keep track of
    protected long first;

    // second value to keep track of
    protected long current;

    // default constructor
    Progression(){
        current = first = 0;
    }

    // return first value
    // also resets the position of current to the first spot
    protected long firstValue(){
        current = first;
        return current;
    }

    // moves along the progression onto the next value
    protected long nextValue(){
        return ++current;
    }

    // print the whole thing
    protected void printProgression(int len){
        System.out.println("the first value is: " + firstValue());
        for(int x = 2; x <= len; x++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }

}
