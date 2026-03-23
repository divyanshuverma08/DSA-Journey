// https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
// https://leetcode.com/problems/longest-consecutive-sequence/description/

package problems.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }

    // Optimal
    static int longestConsecutiveOptimal(int[] arr) {
        // code here
        if (arr.length == 0)
            return 0;
        // Created set to have unique numbers
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;

        for (int ele : arr) {
            set.add(ele);
        }

        for (Integer it : set) {
            // Only check sequence for number which is the starting point
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                while (set.contains(x + 1)) {
                    cnt++;
                    x = x + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    // Better
    static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int lastSmaller = Integer.MIN_VALUE; // To compare with previous
        int longest = 1; // Initial always 1 as every num has it's sequence
        int cnt = 0; // Track count of sequence
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // If sequence found
            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) { // Resets the sequence
                cnt = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
