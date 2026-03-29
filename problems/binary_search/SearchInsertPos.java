// https://www.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1
// https://leetcode.com/problems/search-insert-position/description/
package problems.binary_search;

public class SearchInsertPos {
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
