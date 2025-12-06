import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char i = sc.next().charAt(0);

        if (i >= 'a' && i <= 'z'){
            System.out.println("Lower Case");
        }else if(i >= 'A' && i <= 'Z'){
            System.out.println("Upper Case");
        }
    }
}
