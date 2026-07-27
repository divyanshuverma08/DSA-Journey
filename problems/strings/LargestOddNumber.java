// https://www.geeksforgeeks.org/problems/largest-odd-number-in-string/1
// https://leetcode.com/problems/largest-odd-number-in-string/
package problems.strings;

public class LargestOddNumber {
    public static void main(String[] args) {

    }

    // Optimal
    public String largestOddNumber(String num) {
        int end = -1;

        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                end = i;
                break;
            }
        }

        if (end == -1)
            return "";

        int start = 0;
        while (start <= end && (num.charAt(start) - '0') == 0) {
            start++;
        }

        return num.substring(start, end + 1);
    }
}
