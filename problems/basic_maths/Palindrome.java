//https://leetcode.com/problems/palindrome-number/description/
package problems.basic_maths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 456;
        System.out.println(checkPalindrome(n));
    }

    static boolean checkPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            n /= 10;
            rev = (rev * 10) + ld;
        }

        return temp == n;
    }
}
