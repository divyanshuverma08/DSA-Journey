// https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1
package problems.binary_search;

import java.util.Arrays;

public class paintersPartition {
    public static void main(String[] args) {

    }

    //Optimal
    public int minTime(int[] arr, int k) {
        // code here
        if (k > arr.length)
            return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (timeTaken(arr, k, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int timeTaken(int[] arr, int k, int maxSum) {
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
