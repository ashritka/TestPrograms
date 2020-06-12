import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =  sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7};
       System.out.println(Arrays.toString(arr));

        RotateArray ra = new RotateArray();
        ra.rotate(arr,k);
    }
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arl = new ArrayList<Integer>(nums.length);
        for (int x:
            nums ) {
            arl.add(x);
        }
        System.out.println(arl);
        while(k > 0) {
            arl.add(0, arl.get(nums.length-1));
            arl.remove(nums.length);
            k --;
        }
        System.out.println(arl);
    }
}
