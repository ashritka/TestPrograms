import java.util.Arrays;

public class RemoveDupSortedArray {
    public static void main(String[] args) {
          int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
       // int[] nums = {3, 3, 0, 0, 4, 1, 1, 1, 2, 2, 0, 0, 4};

        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j++] = nums[i+1];
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Length of Array without duplicates: " + j);
    }
}
