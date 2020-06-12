import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
class ThreeSum {
    public static void main(String[] args) {
        List<Integer> arl = new ArrayList<Integer>();

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> fl = new ArrayList<>();
        List<List<Integer>> arrl = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0)  {
                        fl.clear();
                        fl.add(nums[i]);
                        fl.add(nums[j]);
                        fl.add(nums[k]);
                        ArrayList<Integer> fl2 = new ArrayList<>(fl);
                        Collections.sort(fl2);

                        if (!arrl.contains(fl2)) {
                            arrl.add(new ArrayList(fl2));
                            fl2.clear();
                        }
                    }
                }
            }
        }
        return arrl;
    }
}
