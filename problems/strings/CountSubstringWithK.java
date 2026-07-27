// https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1
package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringWithK {
    public static void main(String[] args) {

    }
    
    // Optimal
    public int countSubstr(String s, int k) {
        // code here
        return countAtMost(s, k) - countAtMost(s, k - 1);
    }

    static int countAtMost(String s, int k) {
        int left = 0;
        int res = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0)
                    freq.remove(leftChar);
                left++;
            }

            res += (right - left) + 1;
        }

        return res;
    }
}
