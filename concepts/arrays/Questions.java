package concepts.arrays;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // swap(arr, 0, 5);
        System.out.println(Arrays.toString(arr));

        max(arr);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
