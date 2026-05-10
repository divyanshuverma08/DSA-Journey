// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
// https://www.geeksforgeeks.org/problems/smallest-divisor/1
package problems.binary_search;

import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        
    }

    // Optimal
    public int smallestDivisor(int[] nums, int threshold) {
        if(threshold < nums.length) return - 1;

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(sumOfDivision(nums,mid) <= threshold){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        return low; 
    }

    static int sumOfDivision(int[] arr, int divisor){
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }
}
