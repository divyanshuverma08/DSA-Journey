package concepts.basics.functions;

public class Shadowing {
    static int x = 90; // This will be shadowed

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // Class variable will be shadowed by this
        System.out.println(x);

        func();
    }

    static void func(){
        System.out.println(x);
    }
}
