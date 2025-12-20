// 1. https://www.geeksforgeeks.org/problems/print-gfg-n-times/1
// 2. https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1 
package problems.recursion;

public class PrintN {
    public static void main(String[] args) {
        printNTo12(3);
    }

    static void printNTimes1(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println("Divyanshu");

        printNTimes1(i + 1, n);
    }

    static void printNTimes2(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println("Divyanshu");

        printNTimes2(n - 1);
    }

    static void print1ToN1(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.print(i + " ");

        print1ToN1(i + 1, n);
    }

    static void print1ToN2(int n) {
        if (n <= 0) {
            return;
        }

        print1ToN2(n - 1);
        System.out.print(n + " ");
    }

    static void printNTo11(int i, int n) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        printNTo11(i - 1, n);
    }

    static void printNTo12(int n) {
        if (n < 1)
            return;
        System.out.print(n + " ");
        printNTo12(n - 1);
    }
}
