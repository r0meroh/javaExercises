package Progression_example;

public class ArithmeticProgression extends Progression {

    // keeps track of the amount of increments performed
    protected long increment;

    // default constructor
    ArithmeticProgression(){
        this(1);
    }

    /** Parametric constructor
     *
     * @param inc
     */
    ArithmeticProgression(long inc){
        this.increment = inc;
    }

    // advance progression overloaded method
    protected long nextValue(){
        current += increment;
        return current;
    }

    // firstValue() and printProgression() are inherited from Progression class


}
