// https://www.geeksforgeeks.org/problems/merge-sort/1
package concepts.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6, 8, 10 };

        System.out.println(Arrays.toString(mergeTwoArrays(arr1, arr2)));

        int[] arr3 = {3,1,2,4,1,5,2,6,4};
        int[] ans = mergeSortReturn(arr3, 0, arr3.length - 1);
        System.out.println(Arrays.toString(ans));

        int[] arr4 = {4,6,2,5,7,9,1,3};
        quickSort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));
    }

    static void quickSort(int[] arr, int low, int high){
        //Base case - Always do for array has more than size 1
        if(low<high){
            int partition = findPartition(arr,low,high);
            //Sort Left side of partition
            quickSort(arr, low, partition - 1);
            //Sort Right side of partition
            quickSort(arr, partition + 1, high);
        }
    }

    static int findPartition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low; // left most
        int j = high; // right most

        while(i<j){
            //Move till ith ele < pivot to find first largest ele than pivot
            while(arr[i]<=pivot && i <= high){
                i++;
            }
            //Move till jth ele > pivot to find first smallest ele than pivot
            while(arr[j]>pivot && j>=low){
                j--;
            }
            //If they don't cross because after crossing we would have all small at left and all large at right
            // swap to achieve left - smaller and right - larger
            if(i<j) swap(arr, i, j);
        }
        // Put pivot at jth index as left of pivot will be small and right of pivot will be large
        swap(arr, low, j);

        return j; //Partition
    }

        static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //This is if returned the array
    static int[] mergeSortReturn(int[] arr, int low, int high){
        if(low==high) return new int[]{arr[low]};
        int mid = (low + high)/2;
        int[] left = mergeSortReturn(arr, low, mid);
        int[] right = mergeSortReturn(arr, mid+1, high);
        return mergeTwoArrays(left, right);
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;

    }
}
