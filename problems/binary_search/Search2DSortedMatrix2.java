// https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1
// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
package problems.binary_search;

public class Search2DSortedMatrix2 {
    public static void main(String[] args) {

    }

    // Optimal
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            int element = matrix[row][col];

            if (element == target) {
                return true;
            } else if (element > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

}
