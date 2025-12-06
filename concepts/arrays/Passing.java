package concepts.arrays;

import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(arr));

        change(arr); // Will change as value of reference variable is passed

        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[2] = 77;
    }
}
