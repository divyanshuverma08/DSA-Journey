// https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
package problems.binary_search;

public class CountRotationRotatedSorted {
    public static void main(String[] args) {

    }

    public int findMin(int[] arr) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[low] <= arr[high]) {
                ans = Integer.min(ans, arr[low]);
                break;
            }

            if (arr[low] <= arr[mid]) {
                ans = Integer.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Integer.min(ans, arr[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}
