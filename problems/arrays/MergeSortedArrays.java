// https://leetcode.com/problems/merge-sorted-array/description/
// Different - https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
package problems.arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

}
