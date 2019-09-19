public class insertionSort {

    int [] insertSort (int[] x) {

        for(int i = 1; i < x.length; i++) {

            int key = x[i];

            int j = i - 1;

            while(j >= 0 && x[j] > key) {

                x[j + 1] = x[j];

                j = j-1;
            }
            x[j + 1] = key;
        }

        return x;

    }

    void printInsert(int[] x) {
        for(int nums:x)
            System.out.print(nums + " ");
    }
}

