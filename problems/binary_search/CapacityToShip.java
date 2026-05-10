// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
// https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
package problems.binary_search;

import java.util.Arrays;

public class CapacityToShip {
    public static void main(String[] args) {

    }

    // Optimal
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int needed = daysNeeded(weights, mid);

            if (needed <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }

        return days;
    }
}
