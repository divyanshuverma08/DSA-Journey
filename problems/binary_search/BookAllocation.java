// https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
package problems.binary_search;

import java.util.Arrays;

public class BookAllocation {
    public static void main(String[] args) {

    }

    // Optimal
    public int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length)
            return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        int res = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(arr, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }

    static boolean isPossible(int[] arr, int k, int barrier) {
        int persons = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > barrier)
                return false;
            if (pages + arr[i] > barrier) {
                persons += 1;
                pages = arr[i];
            } else {
                pages += arr[i];
            }
        }

        if (persons > k)
            return false;

        return true;
    }
}
