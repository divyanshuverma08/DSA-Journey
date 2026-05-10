// https://www.geeksforgeeks.org/problems/split-array-largest-sum--141634/1
// https://leetcode.com/problems/split-array-largest-sum/description/
package problems.binary_search;

import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    //Optimal
    public int splitArray(int[] arr, int k) {
        // code here
        if (k > arr.length)
            return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (countSubArrays(arr, k, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int countSubArrays(int[] arr, int k, int maxSum) {
        int count = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > maxSum) {
                count += 1;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }

        return count;
    }
}
