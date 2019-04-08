
//this class is a selection sort
public class selectionSort {

    int[] selectionSort(int[] x)
    {
        //move down the array
        for(int i =0; i < x.length-1; i++)
        {
            //fing the smallest number per iteration
            int minNum = i;
            for (int j = i+1; j < x.length; j++)
            {
                //compare current element to smallest element
                if(x[j]<x[minNum])
                {
                    minNum = j;
                }
            }
            //swap elements
            int temp = x[minNum];
            x[minNum]=x[i];
            x[i] = temp;
        }
        //return memory address to acknowledge changes
        return x;
    }

    void printSort (int[] x)
    {
        //use for each to print newly sorted array
        for(int num:x) {
            System.out.print(num + " ");
        }
    }


}

