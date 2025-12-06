import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        // System.out.print(args[0]);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        System.out.print(n + m);
    }
}