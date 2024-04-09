import java.util.Arrays;

public class Lab1 {
    /** Sorting algorithms **/

    // Insertion sort.

    public static void insertionSort(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j > -1 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Quicksort.

    private static void quickSort(int[] a, int low, int high) {

     //   System.out.println(Arrays.toString(a));

        int pivot = partition(a, low, high);
// assume that partition returns the
// index where the pivot now is
            low++;

        for (int i = 1; i < a.length ; i++) {
            if (low >= high){
                int tmp = a[0];
                a[0] = a[high];
                a[high] = tmp;
                return;
            }
            if(a[low] < pivot)
            {
                low++;
            }
            if(a[high] > pivot)
            {
                high--;
            }if (a[high] < pivot && a[low] > pivot)
            {
                int tmp = a[low];
                a[low] = a[high];
                a[high] = tmp;
            }
        }
     //   System.out.println(Arrays.toString(a));

        //quickSort(a, low, pivot-1);
        //quickSort(a, pivot+1, high);

    }

    // Quicksort part of an array
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        return array[begin];
    }



    // Mergesort.

    public static int[] mergeSort(int[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2) {
            //return;
        }

        int midIndex = arrayLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = midIndex; i < arrayLength; i++) {
            rightHalf[i-midIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);



        throw new UnsupportedOperationException();
    }

    // Mergesort part of an array
    private static int[] mergeSort(int[] array, int begin, int end) {
        throw new UnsupportedOperationException();
    }

    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;









        throw new UnsupportedOperationException();
    }
}
