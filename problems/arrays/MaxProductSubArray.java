// https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
// https://leetcode.com/problems/maximum-product-subarray/
package problems.arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {

    }

    // Optimal
    int maxProduct(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix *= arr[i];
            suffix *= arr[n - i - 1];

            max = Integer.max(max, Integer.max(prefix, suffix));
        }

        return max;
    }
}
