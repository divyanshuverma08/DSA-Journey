// Rotate right by 1 - https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
// Rotate left by d places - https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
// Rotate right by d places - https://leetcode.com/problems/rotate-array/description/
package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // int[] ans = leftRotateArray(arr, 2);
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));

        int k = 2;
        int n = arr.length;
        k = k % n;

        //Left
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1); //Full Array
        // Right
        reverse(arr, 0, n - 1); //Full Array
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate with extra space
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = n - k; i < n; i++) {
            temp.add(nums[i]);
        }

        for (int i = n - 1 - k; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp.get(i);
        }
    }

    // Brute Extra
    static int[] leftRotateArray(int[] arr, int k) {

        if (k > arr.length) {
            k = k % arr.length;
        }

        if (k == arr.length) {
            return arr;
        }

        int[] left = new int[k];
        int[] right = new int[arr.length - k];

        for (int i = 0; i < k; i++) {
            left[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            right[i - k] = arr[i];
        }

        return merge(right, left);

    }

    static int[] merge(int[] a, int[] b) {
        int n = a.length + b.length;
        int c[] = new int[n];

        int i = 0;
        int k = 0;
        while (i < a.length && k < c.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        int j = 0;
        while (j < b.length && k < c.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
