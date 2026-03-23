// https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
package problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrWithSumZero {
    public static void main(String[] args) {

    }

    //Optimal
    static int maxLength(int arr[]) {
        // code here
        int maxLength = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if (!map.isEmpty() && map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLength = Math.max(len, maxLength);
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;

    }

}
