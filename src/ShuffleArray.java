import java.util.ArrayList;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        int[] numsret = shuffle(nums, n);
        for (int x : numsret) {
            System.out.print(x + " ");
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums1.add(nums[i]);
            nums1.add(nums[n + i]);
        }

       // int[] arr = nums1.stream().mapToInt(Integer::intValue).toArray();
        int [] arr = new int[nums1.size()];
        for (int i = 0; i < nums1.size(); i++) {
            arr[i] = nums1.get(i);
        }
        return arr;
    }
}
