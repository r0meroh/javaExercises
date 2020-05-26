package Progression_example;

public class TestProgression {
    public static void main(String[] args){
        // declare a new instance of the progression class
        Progression prog;

        // testing the Arthimetic Progression subClass
        // modify the progression object to desired parameters
        System.out.println("Arithmetic progression with default increment: ");
        prog = new ArithmeticProgression();
        prog.printProgression(10);

        System.out.println("Arithmetic progression with a default increment of 5: ");
        prog = new ArithmeticProgression(5);
        prog.printProgression(10);
        System.out.println();

        // testing the Geometric
        System.out.println("Geometric Progression with default base: ");
        prog = new GeometricProgression();
        prog.printProgression(10);
        System.out.println("Geometric Progression with base 3: ");
        prog = new GeometricProgression(3);
        prog.printProgression(10);
        System.out.println();

        // testing Fibonacci Progression sequence
        System.out.println("Fibonacci Progression with default starting values: ");
        prog = new fibonacciProgression();
        prog.printProgression(10);

        System.out.println("Fibonacci Progression with starting values of 4 and 6");
        prog = new fibonacciProgression(4,6);
        prog.printProgression(10);
        System.out.println();



    }
}
