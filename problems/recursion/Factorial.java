package problems.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOfN(5));
    }

    static int factorialOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialOfN(n - 1);
    }
}
