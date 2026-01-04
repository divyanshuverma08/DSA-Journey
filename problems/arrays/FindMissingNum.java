// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// https://leetcode.com/problems/missing-number/submissions/1874048233/

package problems.arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 3 };

        System.out.println(missingNum(arr));
    }

    static int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int XOR1 = 0;
        int XOR2 = 0;

        for (int i = 0; i < n ; i++) {
            XOR2 = XOR2 ^ arr[i];
            XOR1 = XOR1 ^ (i + 1);
        }
        return XOR1 ^ XOR2;
    }
}
