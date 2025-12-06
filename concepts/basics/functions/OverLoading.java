package concepts.basics.functions;

public class OverLoading {
    public static void main(String[] args) {
        fun(4); // Done at compile time
        fun("Divyanshu");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
}
