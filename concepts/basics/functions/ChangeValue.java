package concepts.basics.functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        String name = "Divyanshu";
        
        changeName(name);

        System.out.println(name); // No change as value is passed

        int arr[] = {1,2,3};

        change(arr);

        System.out.println(Arrays.toString(arr)); //Changes as value of reference is passed in case of objects
    }

    static void changeName(String str){
        str = "Div";
    }

    static void change(int[] array){
        array[0] = 2;
    }
}
