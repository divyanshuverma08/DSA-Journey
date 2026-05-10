// EPs - https://www.geeksforgeeks.org/problems/square-root-of-number-upto-given-precision/1
// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
package problems.binary_search;

public class NOfM {
    public static void main(String[] args) {

    }

    // Optimal
    public int nthRoot(int n, int m) {
        // code here
        if (m < 2)
            return m;

        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long ans = (int) Math.pow(mid, n);
            if (ans == m) {
                return mid;
            }

            if (ans > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    //EPS
        public double squareRoot(int n, int p) {
        // code here
        double low = 0;
        double high = n;
        double eps = 1;
        
        for(int i = 0; i < p; i++){
            eps/=10;
        }
        
        while((high-low) > eps){
            double mid = (low+high)/2.0;
            double ans = Math.pow(mid,2);
            if(ans < n){
                low = mid;
            }else{
                high = mid;
            }
        }
        
        return low;
    }

}
