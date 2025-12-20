package concepts.recursion;

public class Main {
    public static void main(String[] args) {
        func();
    }

    //Infinite Recursion
    static void f(){
        System.out.println(1);
        f();
    }

    //Base Condition
    static int cnt = 0;
    static void func(){
        if(cnt == 3){
            return;
        }

        System.out.println(cnt);
        cnt++;
        func();
    }
}
