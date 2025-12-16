//https://www.geeksforgeeks.org/problems/prime-number2314/1
package problems.basic_maths;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrime(13));
    }

    static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
            if (count > 2)
                return false;
        }

        return true;
    }
}
