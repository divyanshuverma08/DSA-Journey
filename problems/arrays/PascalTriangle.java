// https://leetcode.com/problems/pascals-triangle/
// https://www.geeksforgeeks.org/problems/pascal-triangle0652/1
package problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            ans.add(generateRow(i));
        }

        return ans;
    }

    static List<Integer> generateRow(int row){
        int ans = 1;

        List<Integer> ansRow = new ArrayList<>();

        ansRow.add(ans);

        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }

        return ansRow;
    }
}
