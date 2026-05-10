// https://leetcode.com/problems/koko-eating-bananas/description/
// https://www.geeksforgeeks.org/problems/koko-eating-bananas/1
package problems.binary_search;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    // Optimal
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt(); // Max can be eaten

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalH = calculateTotalHours(piles, mid); // Total time took to eat all

            //Possible answer
            if (totalH <= h) {
                high = mid - 1; // Go towards minimum answer
            } else { // Not Possible
                low = mid + 1; // Go towards possible range
            }
        }

        return low;
    }

    static int calculateTotalHours(int[] piles, int speed) {
        int totalH = 0;
        for (int bananas : piles) {
            totalH += Math.ceil((double) bananas / speed);
        }
        return totalH;
    }
}
