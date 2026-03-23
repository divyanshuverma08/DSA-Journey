// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
package problems.arrays;

import java.util.ArrayList;

public class FindMissAndRep {
    public static void main(String[] args) {

    }

    //Optimal
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        long n = arr.length;

        long SN = (n * (n + 1)) / 2;
        long SN2 = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;

        for (int i = 0; i < n; i++) {
            S += (long) arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }

        long val1 = S - SN;
        long val2 = S2 - SN2;
        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x);
        ans.add((int) y);

        return ans;
    }
}
