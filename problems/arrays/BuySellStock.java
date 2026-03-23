// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// https://www.geeksforgeeks.org/problems/buy-stock-2/1
package problems.arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(maximumProfit(arr));

    }

    static int maximumProfit(int prices[]) {
        // Code here
        int profit = 0;
        int min = prices[0];

        //No point so 0 as you can't buy and sell on same day
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]); // Updating minimum of prices buys
        }

        return profit;
    }
}
