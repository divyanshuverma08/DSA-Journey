// https://leetcode.com/problems/longest-palindromic-substring/description/
// https://www.geeksforgeeks.org/problems/longest-palindrome-in-a-string1956/1
package problems.strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

    }

    // Optimal - Expansion from centre
    public String getLongestPal(String s) {
        // code here
        int n = s.length();
        int maxLen = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int currLen = right - left + 1;
                if (currLen > maxLen) {
                    start = left;
                    maxLen = currLen;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int currLen = right - left + 1;
                if (currLen > maxLen) {
                    start = left;
                    maxLen = currLen;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, maxLen + start);
    }

}
