//https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
package problems.basic_maths;
import java.util.*;

public class printAllDivisors {
    public static void main(String[] args) {
        printDivisors(30);
    }

    // Brute Force
    static void print_divisors(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    // Optimized
    static void printDivisors(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
                if (n / i != i) {
                    ans.add(n/i);
                }
            }
        }
        ans.sort(null);
        System.out.println(ans);
    }
}
