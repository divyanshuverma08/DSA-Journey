// https://leetcode.com/problems/rotate-string/description/
package problems.strings;

public class RotateString {
    public static void main(String[] args) {

    }

    // Optimal
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }
}
