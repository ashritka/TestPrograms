import java.util.*;
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
class ThreeSum2 {
    public static void main(String[] args) {
        List<Integer> arl = new ArrayList<Integer>();

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return Collections.emptyList();
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) { //0 < 4
            int j = i + 1; //j = 1
            int k = nums.length - 1; // k = 5
            while (j < k) { // while (1 < 5), (2 < 5)
                int sum = nums[i] + nums[j] + nums[k]; // sum = -5, -2, 1, -6
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                if (sum > 0) k--;
                if (sum < 0) j++; //j = 2, 3, 4 // i = 1
              /*  if (sum > 0) j++;
                if (sum < 0) k--;*/
            }
        }

        return new ArrayList<>(set);
    }
}