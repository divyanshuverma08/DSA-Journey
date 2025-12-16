//https://leetcode.com/problems/reverse-integer/description/
package problems.basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 456;
        System.out.println(reverseNumber(n));
    }

    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int ld = n % 10; 
            n /= 10;
            rev = (rev * 10) + ld;
        }

        return rev;
    }
}
