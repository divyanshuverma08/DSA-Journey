// https://www.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1
// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class BeautyOfAllSubstrings {
    public static void main(String[] args) {

    }

    // Array approach
    public static int getMinCount(int[] freq) {
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                minCount = Math.min(minCount, freq[i]);
            }
        }
        return minCount;
    }

    public static int getMaxCount(int[] freq) {
        int maxCount = 0;
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }
        return maxCount;
    }

    // Map Approach
    public static int beautySumMap(String s) {
        // code here
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // 0
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int beauty = getMaxCount(freq) - getMinCount(freq);
                sum += beauty;
            }
        }
        return sum;
    }

    public int beautySum(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            for (int j = i; j < n; j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int val : freq.values()) {
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                }

                sum += max - min;
            }
        }

        return sum;
    }
}
