// https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
package problems.binary_search;

public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Array Already Sorted
            if (nums[low] <= nums[high]) {
                ans = Integer.min(ans, nums[low]);
                break;
            }

            // Left Sorted
            if (nums[low] <= nums[mid]) {
                ans = Integer.min(ans, nums[low]);
                low = mid + 1; // Eliminate left
            } else { // Right Sorted
                ans = Integer.min(ans, nums[mid]);
                high = mid - 1; // Eliminate right
            }
        }

        return ans;
    }

}
