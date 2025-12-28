// https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
package problems.arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(checkIfSorted(arr));
    }
    // TC - O(N)
    static boolean checkIfSorted(int[] arr) {
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return sorted;
    }
}
