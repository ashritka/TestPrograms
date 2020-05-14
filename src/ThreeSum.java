import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        List<Integer> arl = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to add to ArrayList :" );
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arl.add(a);
        }
        int[] arr = new int[arl.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arl.get(i);
        }
        System.out.println("Array is " + Arrays.toString(arr));
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> fl = new ArrayList<>();
        List<List<Integer>> arrl = new ArrayList<List<Integer>>();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++ ) {
            sum = sum + nums[i];
            count ++;
            for (int j = i+1; j < nums.length; j++) {
               int sum1 = sum + nums[j];
                count ++;
                for (int k = j+1; k < nums.length; k++) {
                    count ++;
                    if ((sum1 + nums[k] == 0) && (count == 3)) {
                            fl.clear();
                            fl.add(nums[i]);
                            fl.add(nums[j]);
                            fl.add(nums[k]);
                            if (!arrl.contains(fl)) {
                                arrl.add(new ArrayList(fl));
                            }
                        }
                    count = 2;
                    }
                count = 1;
                }
            count = 0;
            sum = 0;
            }
        return arrl;
    }

}
