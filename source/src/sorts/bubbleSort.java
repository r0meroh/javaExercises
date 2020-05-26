package sorts;

public class bubbleSort {

    public int[] bubbly (int[] x){

        for(int i = 0; i < x.length - 1; i++){
            for(int j = 0; j < x.length - i - 1; j++){
                if(x[j] > x [j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        return x;
    }
    public void printBubbles(int[] x){
        for(int num:x)
            System.out.print(num + " ");

    }

}

