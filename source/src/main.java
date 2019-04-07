//this program is my attempt to exercise my java muscle
//this specific program will eventually have sorting algorithms


public class main {
    public static void main(String[] args){
  /**      System.out.println("hello");
        String hi = "hi";
        System.out.println(hi);
   **/
      int firstInt =10, secondInt = 9;
      int thirdInt = 1, fourthInt = 111;





      System.out.println(WhatIsBigger(firstInt,secondInt));
      System.out.println(WhatIsBigger(thirdInt,fourthInt));




    }

    private static int  WhatIsBigger (int x, int y)
    {
        int temp = 0;
        if (x > y)
        {
            //System.out.println(x);
            return x;
        }else if(y>x)
        {
            //System.out.println(y);
            return y;
        }

        return temp;
    }
}


