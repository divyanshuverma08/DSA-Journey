// https://leetcode.com/problems/remove-outermost-parentheses/
// https://www.geeksforgeeks.org/problems/outermost-parentheses/1
package problems.strings;

public class RemoveOuterParenthesis {
    public static void main(String[] args) {

    }

    // Optimal
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0)
                    ans.append('(');
                count++;
            } else {
                count--;
                if (count > 0)
                    ans.append(')');
            }
        }

        return ans.toString();
    }
}
