//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
package problems.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4,0,0,5,6,0,7};
        System.out.println(Arrays.toString(arr));
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Optimal
    static void moveZeroToEnd(int[] arr){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j==-1) return;

        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
}
