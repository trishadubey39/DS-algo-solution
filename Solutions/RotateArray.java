package Solutions;

import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 2,7,11,15};
        rotate(arr, 10);
        twoSum(arr,9);
        
    }

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

    public static int[] twoSum(int[] nums, int target) {
        int[] counts = new int[2];
        int l=0;
        int j=nums.length-1;
        while(l<j){
            if(nums[l]+nums[j] ==target){
                counts[0]=l;
                counts[1]=j;
                return counts;
            }else{
                l++;
                j--;
            }
        }
       return counts; 
    }
}
