// https://leetcode.com/problems/string-to-integer-atoi/
// https://www.geeksforgeeks.org/problems/implement-atoi/1
package problems.strings;

public class StringToInt {
    public static void main(String[] args) {
        
    }

    public int myAtoi(String s) {
        int idx = 0;
        int sign = 1;

        while (s.length() > idx && s.charAt(idx) == ' ') {
            idx++;
        }

        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx) == '-') {
                sign = -1;
            }
            idx++;
        }

        return parseDigits(s, idx, 0, sign);
    }

    static int parseDigits(String s, int idx, int res, int sign) {
        if (idx >= s.length() || s.charAt(idx) > '9' || s.charAt(idx) < '0') {
            return sign * res;
        }

        int digit = s.charAt(idx) - '0';

        if (res > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return parseDigits(s, idx + 1, res * 10 + digit, sign);
    }
}
