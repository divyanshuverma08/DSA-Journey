// Floor - https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
// Ceil - https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1
package problems.binary_search;

public class FloorAndCeil {
    public static void main(String[] args) {

    }

    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
