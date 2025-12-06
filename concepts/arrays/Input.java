package concepts.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[2];

        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        for (int num : array) { // For each loop
            System.out.println(num);
        }

        System.out.println(array[5]); // index out of bound
    }
}
