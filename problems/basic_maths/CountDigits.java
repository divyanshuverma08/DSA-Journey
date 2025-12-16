//https://www.geeksforgeeks.org/problems/count-digits-1606889545/1
package problems.basic_maths;

public class CountDigits {
    public static void main(String[] args) {
        //Brute Force
        int n = 456;
        System.out.println(countDigits(n));   
        String num = String.valueOf(n);
        System.out.println(num.length());
        //Optimized
        int count = (int)(Math.log10(n)) + 1;
        System.out.println(count);
    }

    static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }

        return count;
    }
}
