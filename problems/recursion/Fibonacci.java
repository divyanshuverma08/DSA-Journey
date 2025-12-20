// https://leetcode.com/problems/fibonacci-number/description/
package problems.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 2) + fib(n - 1);
    }
}
