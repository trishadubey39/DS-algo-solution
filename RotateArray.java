import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 10);
    }

    // public static ArrayList<Integer> rotate(int[] nums, int k) {
    // // if number is ggreater than the length
    // k = k % (nums.length);
    // ArrayList<Integer> arr = new ArrayList<Integer>();
    // for (int i = 0; i < nums.length; i++) {
    // if (i < k) {
    // arr.add(nums[nums.length + i - k]);
    // System.out.println(nums[nums.length + i - k] + "");
    // } else {
    // arr.add(nums[i - k]);
    // }
    // }
    // System.out.println(arr.toString());
    // return arr;
    // }

    public static void reverse(int nums[], int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}
