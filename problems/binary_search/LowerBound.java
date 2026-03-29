// https://www.geeksforgeeks.org/problems/implement-lower-bound/1

package problems.binary_search;

public class LowerBound {
    public static void main(String[] args) {

    }

    // Optimal - Binary Search
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid; // Possible ans
                high = mid - 1; // Search on left if more smaller index can be found
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
