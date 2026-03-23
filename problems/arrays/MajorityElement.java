package problems.arrays;

public class MajorityElement {
    public static void main(String[] args) {

    }

    //Optimal -  Moore's Algorithm
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int cnt = 0;
        int ele = -1;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele)
                counter++;
        }

        if (counter > (n / 2))
            return ele;

        return -1;
    }
}
