package Progression_example;

public class fibonacciProgression extends Progression {

    // previous value
    protected long previous;

    // default constructor
    fibonacciProgression(){
        this(0, 1);
    }


    /** Parametric constructor
     *
     * @param firstValue
     * @param secondValue
     */
    fibonacciProgression(long firstValue, long secondValue){
        this.first = firstValue;
        this.previous = secondValue - firstValue;
    }


    // override of the nextValue() method
    protected long nextValue(){
        long temp = previous;
        previous = current;
        current += temp;
        return current;
    }

    // the other methods are inherited from the Progression class
}
