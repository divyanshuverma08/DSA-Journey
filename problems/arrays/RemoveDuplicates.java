// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// In place
// https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
package problems.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

    }

    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }
}
