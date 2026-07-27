// https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1
// https://leetcode.com/problems/isomorphic-strings/

package problems.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {

    }

    // Optimal 1 - can be done in both Map and Arr
    public static boolean areIsomorphic(String s1, String s2) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s1.length(); ++i) {

            // If character not seen before, store its
            // first occurrence index
            if (!m1.containsKey(s1.charAt(i))) {
                m1.put(s1.charAt(i), i);
            }
            if (!m2.containsKey(s2.charAt(i))) {
                m2.put(s2.charAt(i), i);
            }

            // Check if the first occurrence indices match
            if (!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    // Optimal 2 - Map and Set
    public static boolean areIsomorphic2(String s1, String s2) {

        // character mapping from s1 to s2
        HashMap<Character, Character> m1 = new HashMap<>();

        // Already mapped characters in s2
        HashSet<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i), c2 = s2.charAt(i);

            // If c1 is already mapped
            if (m1.containsKey(c1)) {

                // Check if it maps to the current character in s2
                if (m1.get(c1) != c2)
                    return false;

            } else {

                // Ensure c2 is not already mapped to another character
                if (set2.contains(c2))
                    return false;

                // Create a new mapping and mark c2 as mapped
                m1.put(c1, c2);
                set2.add(c2);
            }
        }
        return true;
    }
}
