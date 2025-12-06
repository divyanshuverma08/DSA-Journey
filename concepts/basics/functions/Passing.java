package concepts.basics.functions;

public class Passing {
    public static void main(String[] args) {
        int a =40;
        int b=50;

        swap(a, b);

        System.out.println(a + " " + b); // Not swapped because of pass by value
    }

    static void swap(int a,int b){
        int temp = b;
        b = a;
        a = temp;
    }
}
