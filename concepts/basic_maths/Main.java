package concepts.basic_maths;

public class Main {
    public static void main(String[] args) {
        printDigits(997744);
    }

    //Print individual Digits in a number
    static void printDigits(int n){
        while(n>0){
            int ld = n%10; // Last digit if you divide by 10
            System.out.println(ld);
            n/=10; //Remove last digit by dividing by 10
        }
    }
}
