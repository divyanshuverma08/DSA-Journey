// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
package problems.binary_search;

public class FirstAndLastOcc {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        if (first == -1)
            return new int[] { -1, -1 };
        int last = lastOccurrence(nums, target);
        return new int[] { first, last };
    }

    static int firstOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                first = mid;
                high = mid - 1;
            } else if (target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return first;
    }

    static int lastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                last = mid;
                low = mid + 1;
            } else if (target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return last;
    }
}
