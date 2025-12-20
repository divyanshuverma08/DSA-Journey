package concepts.hashing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,1};
        int[] hash = new int[13]; // Suppose we have at max 12 number
        //int[1000000000] max 10^9

        for(int i = 0; i < arr.length; i++){
            hash[arr[i]] += 1;
        }

        System.out.println(hash[4]);

        // Character Hashing
        String str = "abcdefzd";
        int[] charHash = new int[26]; //Only Lower or Only Upper case
        // For both int[256] now no need to subtract 'a' or 'A'

        for(int i = 0; i < str.length(); i++){
            charHash[str.charAt(i) - 'a'] += 1;
        }

        System.out.println(charHash['d' - 'a']);

        // Using Map - Unordered
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> entrySet = map.keySet();
        for(Integer key: entrySet){
            System.out.println(key + " :" + map.get(key));
        }
    }
}
