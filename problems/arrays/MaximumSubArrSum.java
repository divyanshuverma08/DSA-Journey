// https://leetcode.com/problems/maximum-subarray/submissions/1880540725/
// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

package problems.arrays;

public class MaximumSubArrSum {
    public static void main(String[] args) {
      int[] arr = {-2,-3,4,-1,-2,1,5,-3};
      
      System.out.println(maxSum(arr));
    }

    //Optimal
    static int maxSum(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            sum+=arr[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}
