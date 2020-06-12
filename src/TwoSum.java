import java.util.*;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
Efficient solution with Hashmap :
https://www.youtube.com/watch?v=AWEhT6NPcc0

 */
public class TwoSum {
    public static void main(String[] args) {
        List<Integer> arl = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to add to ArrayList :" );
        int n = sc.nextInt();
        while(n > 0) {
            int a = sc.nextInt();
            arl.add(a);
            n--;
        }
        System.out.println("Print elements of the arrayList");
        System.out.println(arl);

        int[] nums = new int[arl.size()];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = arl.get(i);
        }

        System.out.println("Print Array " + Arrays.toString(nums));

        System.out.println("Enter the target output INT :");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] re = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++ ) {
                if (nums[i] + nums[j] == target) {
                    re[0] = i;
                    re[1] = j;
                }
            }
        }
        return re;
    }
}
