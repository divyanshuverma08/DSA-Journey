// https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
package problems.binary_search;

public class MedianOf2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,1,2},{2,3,4},{5,5,6}};

        System.out.println(median(mat));
    }

    // Optimal - Binary Search
    static int median(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }

        int req = (n * m) / 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            int countLessThanEqual = findLessThanEqual(mat, mid);

            if (countLessThanEqual <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int findLessThanEqual(int[][] arr, int mid) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += upperBound(arr[i], mid);
        }

        return count;
    }

    static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
