// https://leetcode.com/problems/next-permutation/
package problems.arrays;

public class NextPermutation {
    public static void main(String[] args) {

    }

    // Optimal
    static void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;

        // Find where is the dip i.e. breakpoint. So, After rearranging we can get next
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }

        // If no dip means last permutation
        if (breakpoint == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find just greater than break point
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[breakpoint]) {
                swap(nums, i, breakpoint);
                break;
            }
        }

        // As it is sorted in increasing from back. We reverse to get the smallest
        // in remaining to get just greatest
        reverse(nums, breakpoint + 1, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
