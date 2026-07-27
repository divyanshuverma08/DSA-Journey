// https://www.geeksforgeeks.org/problems/maximum-nesting-depth-of-the-parentheses/1
// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
package problems.strings;

public class MaxDepthParentheses {
    public static void main(String[] args) {

    }

    public static int maxDepth(String s) {
        // code here
        int count = 0;
        int max = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
