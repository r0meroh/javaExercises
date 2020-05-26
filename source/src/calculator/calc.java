package calculator;

public class calc {

    private int first, second;

    public calc(){
        first = 0;
        second = 0;
    }

    public calc(int first, int second){
        this.first = first;
        this.second= second;
    }

    public void decision(String answer){

        switch (answer) {
            case "add":
                add(this.first, this.second);
                break;
            case "subtract":
                subtract(this.first,this.second);
                break;
            case "divide":
                divide(this.first,this.second);
                break;
            case "multiply":
                multiply(this.first,this.second);
                break;
        }

    }

    public void add(int a, int b){

        System.out.println(a + b);
    }

    public void subtract(int a , int b){

        System.out.println(a - b);
    }

    public  void divide(int a, int b){

        System.out.println(a / b);
    }

    public void multiply(int a , int b){

        System.out.println(a * b);
    }
}
