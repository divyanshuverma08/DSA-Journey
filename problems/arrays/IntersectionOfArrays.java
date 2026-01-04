//Sorted - https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-arrays-with-duplicate-elements/1
//Unsorted - https://leetcode.com/problems/intersection-of-two-arrays/description/
package problems.arrays;

import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        System.out.println(intersection(a, b));
        System.out.println(intersectionOptimal(a, b));
    }

    // Optimal
    static ArrayList<Integer> intersectionOptimal(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {

            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }

            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }

        return ans;
    }

    // Brute
    static ArrayList<Integer> intersection(int[] a, int[] b) {
        int[] vis = new int[b.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && vis[j] == 0) {
                    ans.add(a[i]);
                    break;
                }
                if (b[j] > a[i])
                    break;
            }
        }

        return ans;
    }
}
