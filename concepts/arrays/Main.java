package concepts.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // int arr[] = {1,2,3,4}; can do like this also

        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1)); //0
        String[] arr2 = new String[5];
        System.out.println(Arrays.toString(arr2));//null
    }
}
