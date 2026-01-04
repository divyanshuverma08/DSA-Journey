// https://leetcode.com/problems/single-number/description/
// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
package problems.arrays;
import java.util.*;
public class AppearOne {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(findAppearOne(arr));
    }

    //Better
    static int findAppearOne(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key: keySet){
            if(map.get(key) == 1){
                return key;
            }
        }

        return -1;
    }
}
