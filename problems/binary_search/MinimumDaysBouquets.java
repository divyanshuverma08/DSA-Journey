// https://www.geeksforgeeks.org/problems/minimum-days-to-make-m-bouquets/1
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
package problems.binary_search;

public class MinimumDaysBouquets {
    public static void main(String[] args) {
        
    }

    // Optimal
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        long required = (long)m*k;
        if(required>arr.length) return -1;
        
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        
        for(int bloom: arr){
            minDay = Math.min(bloom,minDay);
            maxDay = Math.max(bloom,maxDay);
        }
            
        int low = minDay;
        int high = maxDay;
            
        while(low <= high){
            int mid = (low + high)/2;
                
            if(isPossible(arr,mid,k,m)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
            
        return low;
    }
    
    static boolean isPossible(int[] arr, int day, int k, int m){
        int count = 0;
        int bouquets = 0;
        
        for(int bloom: arr){
            if(bloom <= day){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        
        return bouquets>=m;
    }

}
