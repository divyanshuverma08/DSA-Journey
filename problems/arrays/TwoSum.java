// https://leetcode.com/problems/two-sum/description/
// https://www.geeksforgeeks.org/problems/key-pair5616/1
package problems.arrays;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };

        System.out.println(findTwoSum(arr, 14));
        System.out.println(findTwoSumOptimal(arr, 14));

    }

    // For YES/NO only
    static String findTwoSumOptimal(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return "NO";
    }

    // Better - For indexes
    static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if (!map.isEmpty() && map.containsKey(more)) {
                int[] ans = { i, map.get(more) };
                return ans;
            }
            map.put(arr[i], i);
        }
        int[] ans = { -1, -1 };
        return ans;
    }
}
