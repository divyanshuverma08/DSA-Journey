public class CountNum {
    public static void main(String[] args) {
        int num = 577788887;
        int n = 7;
        int count = 0;
        while (num > 0) {
            if (num % 10 == n) {
                count++;
            }
            num /= 10;
        }

        System.out.println(count);
    }
}
