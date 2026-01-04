// Neg and Pos - https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
//Only Post - https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399
// Alternative - https://leetcode.com/problems/subarray-sum-equals-k/submissions/1874345536/
package problems.arrays;

import java.util.*;

public class LongestSubArrWithK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int[] a = { 2, 0, 0, 3 };
        int[] b = { 1, 2, 1, 2, 1 };

        System.out.println(longestSubArrayWithSumK(b, 3));
        System.out.println(longestSubArrayWithSumKPos(b, 3));
    }

    //Optimal
    static int longestSubArrayWithSumKPos(int[] arr, int k){
        int n = arr.length;
        int right = 0;
        int left = 0;
        int sum = arr[0];
        int maxLen = 0;

        while(right<n){
            while(left<=right && sum > k){
                sum-=arr[left];
                left++;
            }
            if(sum==k) maxLen = Math.max(right - left + 1, maxLen);
            right++;
            if(right<n) sum+=arr[right];
        }
        return maxLen;
    }

    //Optimal for neg & pos Better for only pos
    static int longestSubArrayWithSumK(int[] arr, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();

        Integer sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k; // X - K prefix
            if (!preSumMap.isEmpty() && preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            // preSumMap.put(sum, i);
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
