// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
package problems.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2,1,3,7,2,4,5};
        int largest = arr[0];
        for(int item: arr){
            if(item>largest){
                largest = item;
            }
        }

        System.out.println(largest);
    }
}
