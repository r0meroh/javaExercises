package Generics;

public class generic_main {

    public static void main(String[] args){

        // using instance of for casting

        //wide scope Number object
        Number num;
        // narrow scope Integer object
        Integer inty;

        num = new Integer(5);
        if(num instanceof  Integer){
            inty = (Integer) num;
            System.out.println(num);
        }
        num = new Double(4.234);
        if(num instanceof Integer){
            inty =(Integer) num;
            System.out.println(num);
        }

        System.out.println(num);
    }
}
