// https://leetcode.com/problems/merge-intervals/description/

package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverLappingSubIntervals {
    public static void main(String[] args) {

    }

    // Optimal
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();
        int n = intervals.length;

        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < intervals[i][0]) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                int max = Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]);
                ans.get(ans.size() - 1).set(1, max);
            }
        }

        int[][] result = convert(ans);

        return result;
    }

    public static int[][] convert(List<List<Integer>> list) {
        if (list == null) {
            return new int[0][0]; // Return empty array if input is null
        }

        int rows = list.size();
        int[][] array = new int[rows][];

        for (int i = 0; i < rows; i++) {
            List<Integer> rowList = list.get(i);
            if (rowList == null) {
                array[i] = new int[0]; // Empty row if null
                continue;
            }

            int cols = rowList.size();
            array[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                // Handle null Integer values by treating them as 0
                array[i][j] = (rowList.get(j) != null) ? rowList.get(j) : 0;
            }
        }
        return array;
    }
}
