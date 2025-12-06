package concepts.basics.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,3,4,5,6);
    }

    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
