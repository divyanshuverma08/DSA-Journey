// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
// https://leetcode.com/problems/single-element-in-a-sorted-array/
package problems.binary_search;

public class SingleInSorted {
    public static void main(String[] args) {

    }

    static int single(int[] arr) {
        // code here
        int n = arr.length;
        
        // Edge cases
        if(n == 1) return arr[0]; // Single element
        if(arr[0] != arr[1]) return arr[0]; // First
        if(arr[n - 1] != arr[n - 2]) return arr[n - 1]; //Last

        // Reduce boundary
        int low = 1;
        int high = n - 2;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) return arr[mid];

            // Mid is in left half if pairing is correct
            if((mid%2 == 1 && arr[mid] == arr[mid - 1]) || (mid%2 == 0 && arr[mid] == arr[mid + 1])){
                low = mid + 1;
            }else{ // Right half
                high = mid - 1;
            }
        }

        return -1;
    }
}
