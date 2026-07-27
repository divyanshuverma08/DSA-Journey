// https://leetcode.com/problems/sort-characters-by-frequency/
// https://www.geeksforgeeks.org/problems/sort-string-according-to-increasing-frequency/1
package problems.strings;

import java.util.*;

public class SortCharByFreq {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(sort(s));
    }

    static String sort(String s) {
        StringBuilder result = new StringBuilder();

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(freq.entrySet());
        Collections.sort(entries, (a, b) -> {
            // For lexicographical sorting
            int freqDiff = b.getValue() - a.getValue();
            return freqDiff != 0 ? freqDiff : a.getKey() - b.getKey();
        });

        for (Map.Entry<Character, Integer> entry : entries) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }
}
