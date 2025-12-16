//https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
package problems.basic_maths;

public class GcdOrHcf {
    public static void main(String[] args) {
        System.out.println(Hcf(52, 20));
    }

    // Brute Force
    static int Gcd(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return gcd;
    }

    // Optimized - Elucidian
    static int Hcf(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }

        if (a == 0)
            return b;
        else
            return a;
    }
}
