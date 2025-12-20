package problems.recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADSM";
        // String rev = reverse(str, str.length() - 1);
        // System.out.println(rev);
        // System.out.println(str.equals(rev));
        // System.out.println(str.length());
        // System.out.println(rev.length());

        System.out.println(checkPalindrome(str, 0));
    }

    static String reverse(String str, int i){
        if(i<=0) return "" + str.charAt(i);
        return str.charAt(i) + reverse(str, i - 1);
    }

    static boolean checkPalindrome(String str, int i){
        if(i>=str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length() - i - 1)){
            return false;
        }
        return checkPalindrome(str, i + 1);
    }
}
