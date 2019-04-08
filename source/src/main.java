//this program is my attempt to exercise my java muscle
//this specific program will eventually have sorting algorithms


public class main {
    public static void main(String[] args) {
        //create sort object
        selectionSort sortThis = new selectionSort();
        //initialize array to sort
        int myArray[] = {554,234,77,0,65,234523};

        //test sort
        System.out.println(sortThis.selectionSort(myArray));
        //reassign sorted array to original array
        myArray = sortThis.selectionSort(myArray);
        //print newly sorted array
        sortThis.printSort(myArray);


        //room for next sort
    }
}


