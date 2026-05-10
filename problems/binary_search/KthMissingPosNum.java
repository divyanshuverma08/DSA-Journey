// https://leetcode.com/problems/kth-missing-positive-number/
// https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1
package problems.binary_search;

public class KthMissingPosNum {
    public static void main(String[] args) {

    }

    // Optimal
    static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Missing Numbers at index mid
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}
