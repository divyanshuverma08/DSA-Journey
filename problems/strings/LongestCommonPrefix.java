// https://leetcode.com/problems/longest-common-prefix/description/
// https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
package problems.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    // Optimal
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }

        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != ch) {
                    return result.toString();
                }
            }

            result.append(ch);
        }

        return result.toString();
    }
}
