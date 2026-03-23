// https://www.geeksforgeeks.org/problems/set-matrix-zeroes/1
// https://leetcode.com/problems/set-matrix-zeroes/
package problems.arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 0, 1, 1 } };
        setZeroes(matrix);
    }

    // Optimal - In place tracking
    static void setMatrixZeroes(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int col0 = 1; // Store 1st col value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    // Mark for rows
                    mat[i][0] = 0;
                    if (j != 0) {
                        //Mark for columns
                        mat[0][j] = 0;
                    } else {
                        // Mark for 1st col
                        col0 = 0;
                    }
                }
            }
        }

        // Mark internal array
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] != 0) {
                    if (mat[0][j] == 0 || mat[i][0] == 0) {
                        mat[i][j] = 0;
                    }
                }
            }
        }

        // Mark tracking col arr
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }

        // Mark tracking row arr
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }

    // Better
    static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n]; // Track which row to set zero
        int[] col = new int[m]; // Track which entire col to set zero

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Set zero to row and col in which 0 is encountered
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if element's row or col is set zero
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
