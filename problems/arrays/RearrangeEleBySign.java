// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
// https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

package problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeEleBySign {
    public static void main(String[] args) {

    }

    // Optimal for equal neg and pos
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posIndex = 0;
        int negIndex = 1;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return ans;
    }

    // for pos != neg
    static void rearrange(ArrayList<Integer> arr) {
        // code here
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                neg.add(arr.get(i));
            } else {
                pos.add(arr.get(i));
            }
        }

        int index = 0;
        int posIndex = 0;
        int negIndex = 0;

        while (posIndex < pos.size() && negIndex < neg.size()) {
            if (index % 2 == 0) {
                arr.set(index, pos.get(posIndex));
                index++;
                posIndex++;
            } else {
                arr.set(index, neg.get(negIndex));
                index++;
                negIndex++;
            }
        }

        while (posIndex < pos.size()) {
            arr.set(index, pos.get(posIndex));
            index++;
            posIndex++;
        }

        while (negIndex < neg.size()) {
            arr.set(index, neg.get(negIndex));
            index++;
            negIndex++;
        }
    }
}
