//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

package problems.arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        System.out.println(findUnionOptimal(a, b));

    }

    public static ArrayList<Integer> findUnionOptimal(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        int n1 = a.length;
        int n2 = b.length;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (ans.size() == 0 || ans.getLast() != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.size() == 0 || ans.getLast() != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (ans.size() == 0 || ans.getLast() != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (ans.size() == 0 || ans.getLast() != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    // Brute
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int ele : set) {
            ans.add(ele);
        }
        return ans;
    }
}
