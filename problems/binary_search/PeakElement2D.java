// https://leetcode.com/problems/find-a-peak-element-ii/description/
// https://www.geeksforgeeks.org/problems/find-the-peak-element-in-a-2d-matrix/1
package problems.binary_search;

public class PeakElement2D {
    public static void main(String[] args) {

    }

    // Optimal
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = maxElement(mat, mid);

            int left = mid - 1 >= 0 ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < m ? mat[row][mid + 1] : Integer.MIN_VALUE;

            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[] { row, mid };
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    static int maxElement(int[][] arr, int col) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
                index = i;
            }
        }

        return index;
    }
}
