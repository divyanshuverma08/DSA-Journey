// https://leetcode.com/problems/sqrtx/
// https://www.geeksforgeeks.org/problems/square-root/1
package problems.binary_search;

public class Sqrt {
    public static void main(String[] args) {

    }

    // Optimal
    public static int mySqrt(int x) {
        int low = 1;
        int high = x;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;

            // Possible range
            if (mid * mid <= x) {
                low = (int) mid + 1; //Move right to find max <= n
            } else {// Not possible range
                high = (int) mid - 1; //Move to left to be in possible range
            }
        }

        return high;
    }
}
