package concepts.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 }, // can be different length
                { 4, 5 }
        };

        int[][] arr1 = new int[3][3];

        for (int[] array : arr) {
            System.out.println(Arrays.toString(array));
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
