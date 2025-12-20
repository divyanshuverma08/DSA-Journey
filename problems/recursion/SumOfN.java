// https://www.geeksforgeeks.org/problems/reverse-coding2452/1
package problems.recursion;

public class SumOfN {
    public static void main(String[] args) {
        sum(3, 0);
        System.out.println(sum(3));
    }

    // Parameterized
    static void sum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sum(i - 1, sum + i);
    }

    // Functional
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
