// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

package problems.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {

    }

    //Optimal
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        //Reverse traversal
        for (int i = arr.length - 1; i >= 0; i--) {
            // If ele is > max means it is > than all elements in right
            if (arr[i] >= max) {
                ans.add(arr[i]);
            }
            // Update max
            max = Math.max(max, arr[i]);
        }

        Collections.reverse(ans);
        return ans;
    }
}
