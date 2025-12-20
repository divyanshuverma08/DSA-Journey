// https://www.geeksforgeeks.org/problems/reverse-an-array/1
package problems.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        recursionReverse(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void recursionReverse(int arr[], int i, int n) {
        if (i >= n / 2)
            return;
        swap(arr, i, n - i - 1);
        recursionReverse(arr, i + 1, n);
    }

    static void whileLoop(int arr[]) {
        int i = 0;
        int n = arr.length;
        while (i <= n / 2) {
            swap(arr, i, n - i - 1);
            i++;
        }
    }
}
