// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
package problems.binary_search;

import java.util.Arrays;

public class RowWithMax1 {
    public static void main(String[] args) {
        int mat[][] = { { 0, 1, 1 }, { 0, 0, 1 } };

        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
    }

    static int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count_max = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int one_pos = firstOccurrence(mat[i], m, 1);
            int count_ones = m - one_pos;
            if (count_ones > count_max) {
                count_max = count_ones;
                index = i;
            }
        }

        return new int[] { index, count_max };
    }

    static int firstOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n; // Default value if no such index is found

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid; // Possible answer found
                high = mid - 1; // Try to find a smaller index
            } else {
                low = mid + 1; // Move right
            }
        }
        return ans; // Index of first element >= x
    }
}
