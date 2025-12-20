// https://www.geeksforgeeks.org/problems/frequency-of-elements--111353/1
package problems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountFreq {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 4, 3, 3, 3 };
        System.out.println(countFreq(arr));
    }

    static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> entrySet = hashMap.keySet();

        for (Integer key : entrySet) {
            ArrayList<Integer> ele = new ArrayList<>();
            ele.add(key);
            ele.add(hashMap.get(key));
            ans.add(ele);
        }

        return ans;
    }
}
