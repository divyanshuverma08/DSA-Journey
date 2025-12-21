package concepts.sorting;

import java.util.Arrays;

public class Sorting1 {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(arr));
        // selectionSort(arr);
        // bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Run till second last
        for (int i = 0; i < n - 1; i++) {
            // Check for swap
            boolean swapped = false;
            // Iterate in unsorted array
            for (int j = 0; j < n - i - 1; j++) {
                // Adjacent swap
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // Break if no swap is done means array is sorted
            if (!swapped)
                break;
        }
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            // Assume current position has min element
            int mini = i;
            // Iterate in unsorted array
            for (int j = i + 1; j <= n - 1; j++) {
                // Find the index of minimum element
                if (arr[j] < arr[i]) {
                    mini = j;
                }
            }
            // At last swap with minimum
            swap(arr, i, mini);
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
