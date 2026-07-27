// https://leetcode.com/problems/roman-to-integer/
// https://www.geeksforgeeks.org/problems/roman-number-to-integer3201/1
package problems.strings;

public class RomanToInteger {
    public static void main(String[] args) {
        
    }

    //Can also use map to store roman value
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (romanValue(s.charAt(i + 1)) > romanValue(s.charAt(i))) {
                ans -= romanValue(s.charAt(i));
            } else {
                ans += romanValue(s.charAt(i));
            }
        }

        ans += romanValue(s.charAt(s.length() - 1));

        return ans;
    }

    static int romanValue(char symbol) {
        int value = 0;
        switch (symbol) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
        }

        return value;
    }
}
