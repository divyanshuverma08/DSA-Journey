package concepts.basics.functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;

        {
            a = 20;

            // int a = 30; // Cannot initialize again
            int b = 20;
        }

        // System.out.println(b); // cannot use as initialized in previous block

        for(int i=0; i < 10; i++){

        }

        // System.out.println(i); // cannot access
    }

    static void random(){
        int a = 10; // method scope has new values all together
    }
}
