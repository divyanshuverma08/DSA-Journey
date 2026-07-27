// https://leetcode.com/problems/reverse-words-in-a-string/
// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
package problems.strings;

import java.util.ArrayList;

public class ReverseWords {
    public static void main(String[] args) {

    }

    // Optimal
    public String reverseWordsOptimal(String s) {
        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            String word = s.substring(i + 1, end + 1);

            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(word);
        }

        return result.toString();
    }

    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (str.length() > 0)
                    list.add(0, str.toString());
                str.setLength(0);
            } else {
                str.append(ch);
            }
        }

        if (str.length() > 0)
            list.add(0, str.toString());

        String ans = String.join(" ", list);

        return ans;
    }
}
