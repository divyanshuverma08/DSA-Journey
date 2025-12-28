// https://www.geeksforgeeks.org/problems/second-largest3735/1
// smallest - https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1

package problems.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }

    // TC - O(2N)
    static int better(int arr[]) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans && arr[i] != largest) {
                ans = arr[i];
            }
        }

        return ans;

    }

    // TC - O(N)
    static int optimal(int arr[]) {
        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest && arr[i] != largest) {
                slargest = largest;
                largest = arr[i];
            }

            if (arr[i] > slargest && arr[i] < largest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }
}
