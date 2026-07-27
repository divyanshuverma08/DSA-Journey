package concepts.strings;

public class StringConcepts {
    public static void main(String[] args) {
        //Same: reference to same object
        String a = "Divyanshu";
        String b = "Divyanshu";

        if(a == b) System.out.println("true");

        // Different
        String c = new String("Divyanshu");
        if(a == b) System.out.println("true");

        //Same
        if(a.equals(c)) System.out.println("true");


        //Concatenation - converts other to string
        System.out.println('a' + 1); //b: because character
        System.out.println("a" + 1); //a1
        // One element must be string

        //Immutable
        a += "b"; //Creates a new string ab

        //Pretty print
        float d = 2.5555f;

        System.out.printf("No d is %.2f",d); // 2.56

        // String Builder - Mutable

        StringBuilder string = new StringBuilder();
        string.append(a);

    }
}
