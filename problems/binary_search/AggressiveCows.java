// https://www.geeksforgeeks.org/problems/aggressive-cows/1
package problems.binary_search;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

    }

    static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls); // Sort for consecutive placement

        // Range
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0]; // Max distance for placement if there were two cows

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If possible
            if (canPlace(stalls, mid, k)) {
                low = mid + 1; // Try Larger
            } else {
                high = mid - 1; // Try Smaller
            }
        }

        return high;
    }

    static boolean canPlace(int[] stalls, int D, int k) {
        // Place first cow at start
        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            // If at D distance is the gap between last Pos and current pos. So, can be
            // placed
            if (stalls[i] - lastPos >= D) {
                count++;
                lastPos = stalls[i];
            }

            // If all are placed
            if (count >= k)
                return true;
        }

        return false;
    }
}
