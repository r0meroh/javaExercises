public class mergeSort {

    int[] mergeSort(int[] x, int xx) {
        if(xx < 2) {
            return x;
        }
        int mid = xx/2;

        int[] left = new int[mid];

        int[] right = new int[xx - mid];

        for(int i = 0; i < mid; i++) {

            left[i] = x[i];
        }

        for(int i = mid; i < xx; i++) {
            right[i - mid] = x[i];
        }
        mergeSort(left, mid);
        mergeSort(right, xx - mid);

       x = merge(x, left, right, mid, xx - mid);
        return x;
    }

    int[] merge(int[] x, int[] l, int[] r, int left, int right) {

        int i, j, k ;
        i = j = k = 0;

        while(i < left && j < right) {

            if(l[i] <= r[j]) {
                x[k++] = l[i++];
            }else {
                x[k++] = r[j++];
            }
        }

        while(i < left) {
            x[k++] = l[i++];
        }

        while (j < right) {
            x[k++] = r[j++];
        }
        return x;
    }

    public void printMerge(int[] x) {

        for(int nums: x) {
            System.out.print(nums + " ");
        }
    }



}
