package concepts.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(search(arr, 2));
    }

    // Binary Search
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // Boundary of search space
        while (low <= high) {
            // Middle index
            int mid = (low + high) / 2;

            if (target == nums[mid])
                return mid;
            else if (target < nums[mid]) // Reduce search space to left half
                high = mid - 1;
            else
                low = mid + 1; // Reduce to right half
        }

        return -1;
    }
}
