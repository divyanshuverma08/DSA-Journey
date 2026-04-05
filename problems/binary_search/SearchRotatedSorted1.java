// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
package problems.binary_search;

public class SearchRotatedSorted1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    // Binary Search
    static int search(int[] arr, int key) {
        // code here
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Check Middle

            if (arr[mid] == key)
                return mid; // Return if found

            // If Left is sorted
            if (arr[low] <= arr[mid]) {
                // If target lies in left part
                if (arr[low] <= key && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                // Right is sorted
            } else {
                // If target lies in right part
                if (arr[mid] < key && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
