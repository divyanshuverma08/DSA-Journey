// https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
// https://leetcode.com/problems/subarray-sum-equals-k/
package problems.arrays;

import java.util.HashMap;

public class SubArrWithSumK {
    public static void main(String[] args) {

    }

    //Optimal
    static int subarraySum(int[] nums, int k) {
        // <preSum,cnt>
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            if (!map.isEmpty() && map.containsKey(remove)) {
                cnt += map.get(remove);
            }

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }
}
