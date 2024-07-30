public class MaximumAverageSubarrayI {
    public static void main(String[] args) {

        int[] nums2 = {1,12,-5,-6,50,3};
        System.out.println(maximumAverageSubarrayI(nums2,4));
    }

    public static float maximumAverageSubarrayI(int[]nums, int k){
        float max_avg = 0;
        float curr_avg = 0;
        float last_sum = 0;

        for (int i = 0; i < k; i++) {
            last_sum += nums[i];
        }

        curr_avg = (last_sum )/ k;
        max_avg = Math.max(curr_avg, max_avg);

        for (int i = 1; i < nums.length - k; i++) {
            last_sum =(last_sum- nums[i-1]) + nums[i+k-1];
            curr_avg = last_sum  / k;
            max_avg = Math.max(curr_avg, max_avg);
        }

        return max_avg;
    }

}
