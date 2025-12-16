//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
package problems.basic_maths;

public class AmrstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }

    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        
        while(n>0){
            int num = n%10;
            sum+=Math.pow(num,3);
            n/=10;
        }
        
        return temp == sum;
    }
}
