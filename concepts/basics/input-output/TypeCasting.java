public class TypeCasting {
    public static void main(String[] args) {
        int i = 1;
        float j = 10.0f;
        System.out.println(i + j); //11.0 automatically convert lower type to greater

        //type casting
        int num = (int)69.22f;
        System.out.println(num);

        //automatic type promotion
        int a = 257;
        byte b = (byte)a; // 257%256=1

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int w= (x*y)/z;
        System.out.println(w);
    }
}
