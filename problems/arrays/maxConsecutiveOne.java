// https://leetcode.com/problems/max-consecutive-ones/submissions/1874101095/
package problems.arrays;

public class maxConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1 };
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    
    //Optimal
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int currSum = 0;
        for (int num : nums) {
            if (num == 0)
                currSum = 0;
            currSum += num;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}
