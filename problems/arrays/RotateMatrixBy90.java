// https://leetcode.com/problems/rotate-image/
// https://www.geeksforgeeks.org/problems/rotate-by-90-degree0356/1
package problems.arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {

    }

    // Optimal
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                swap(matrix, i, j);
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            reverse(matrix, i, 0, m - 1);
        }
    }

    static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void reverse(int[][] arr, int row, int start, int end) {
        while (start <= end) {
            int temp = arr[row][start];
            arr[row][start] = arr[row][end];
            arr[row][end] = temp;
            start++;
            end--;
        }
    }
}
