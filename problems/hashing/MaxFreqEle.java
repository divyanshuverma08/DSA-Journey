// https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1
package problems.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxFreqEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 4, 3, 3, 3 };
        System.out.println(mostFreqEle(arr));
    }

    static int mostFreqEle(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxValue = 0;
        int maxEle = 0;

        Set<Integer> entrySet = map.keySet();

        for (Integer key : entrySet) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxEle = (int) key;
            }
        }

        for (Integer key : entrySet) {
            if (map.get(key) == maxValue) {
                if (key > maxEle) {
                    maxEle = key;
                }
            }
        }

        return maxEle;
    }
}
