// https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1
package problems.arrays;

import java.util.HashMap;

public class CountSubArrayWithXORK {
    public static void main(String[] args) {

    }

    // Optimal Hashing
    static public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> preXOR = new HashMap<>(); // Store prefix XOR
        int count = 0;
        int currXOR = 0; // Current XOR

        for (int i = 0; i < arr.length; i++) {
            currXOR = currXOR ^ arr[i]; // Update current XOR

            if (currXOR == k) { // from starting if XOR = k has occurred
                count++;
            }

            // If X=XR^K found in the prefixXOR there for there is sub array with K
            if (!preXOR.isEmpty() && preXOR.containsKey(currXOR ^ k)) {
                count = count + preXOR.get(currXOR ^ k);
            }

            //Update prefixXOR with currXOR
            preXOR.put(currXOR, preXOR.getOrDefault(currXOR, 0) + 1);
        }

        return count;
    }
}
