// https://leetcode.com/problems/majority-element-ii/description/
// https://www.geeksforgeeks.org/problems/majority-vote/1
package problems.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {

        int arr[] = { 3, 3, 4 };
        System.out.println(majorityElementOptimal(arr));

    }

    // Moore's voting
    static List<Integer> majorityElementOptimal(int[] nums) {
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && nums[i] != ele2) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != ele1) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (nums[i] == ele1)
                cnt1++;
            else if (nums[i] == ele2)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1)
                cnt1++;
            if (nums[i] == ele2)
                cnt2++;
        }

        int minimum = (int) (nums.length / 3) + 1;
        if (cnt1 >= minimum)
            ans.add(ele1);
        if (cnt2 >= minimum)
            ans.add(ele2);

        Collections.sort(ans);

        return ans;
    }

    // Better
    static List<Integer> majorityElement(int[] nums) {
        int minimum = ((int) (nums.length / 3)) + 1;

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) == minimum) {
                ans.add(nums[i]);
            }
            if (ans.size() == 2)
                break;
        }

        return ans;
    }

}
