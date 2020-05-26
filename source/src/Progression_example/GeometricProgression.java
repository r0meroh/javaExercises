package Progression_example;

public class GeometricProgression extends Progression {

    // class variable
    protected  long base;

    // default constructor
    GeometricProgression(){
        this(2);
    }

    /** Parametric constructor
     *
     * @param b
     */
    GeometricProgression(long b){
        this.base = b;
        this.first = 1;
        this.current = first;
    }

    protected long nextValue(){
        current *= base;
        return current;
    }

    // other methods inherited from the Progression class

}
