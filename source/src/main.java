//this program is my attempt to exercise my java muscle
//this specific program will eventually have sorting algorithms


public class main {
    public static void main(String[] args) {

        //create sort object
        selectionSort sortThis = new selectionSort();
        //initialize array to sort
        int myArray[] = {554,234,77,0,65,234523};

        System.out.println("original: ");
        sortThis.printSort(myArray);
        System.out.println(" ");

        //test sort
        //System.out.println(sortThis.selectionSort(myArray));
        System.out.println("Selection sort");
        //reassign sorted array to original array
        myArray = sortThis.selectionSort(myArray);
        //print newly sorted array
        sortThis.printSort(myArray);


        //spacing
        System.out.println(" ");



        //room for next sort
        //bubble sort
        bubbleSort bubbles = new bubbleSort();

        int mySecondArray[] = {11,234,55555,8756,1,3,77,888};
        System.out.println("Original:  ");
        bubbles.printBubbles(mySecondArray);
        System.out.println(" ");

        System.out.println("Bubble Sort ");
        mySecondArray = bubbles.bubbly(mySecondArray);
        bubbles.printBubbles(mySecondArray);

        System.out.println("\nInsertion sort: ");
        insertionSort inserts = new insertionSort();
        System.out.println("Original array");
        int myThirdArray[] = {22,99,76,45,66,34,2};
        inserts.printInsert(myThirdArray);
        System.out.println("sorting with insertion sort");
        myThirdArray = inserts.insertSort(myThirdArray);
        inserts.printInsert(myThirdArray);

        System.out.println("\nMerge sort: ");
        mergeSort merging = new mergeSort();
        System.out.println("Original array: ");
        int [] myFourthArray = {55,77,8,6,2,44,1};
        merging.printMerge(myFourthArray);
        System.out.println("\nSorting: ");
        myFourthArray = merging.mergeSort(myFourthArray, myFourthArray.length);
        merging.printMerge(myFourthArray);
    }
}


