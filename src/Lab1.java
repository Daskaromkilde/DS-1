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

        if (high <= low) {
            return;
        }
        int pivot = partition(a, low, high);
        quickSort(a, low, pivot -1);
        quickSort(a, pivot + 1, high);

    }

    // Quicksort part of an array
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];

        int i = begin - 1;

        for (int j = begin; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }



    // Mergesort.
    public static int[] mergeSort(int[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2) {
            return array;
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

        return merge(mergeSort(leftHalf), mergeSort(rightHalf));

    }


    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;
        int[] mergedArray = new int[leftSize + rightSize];

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
