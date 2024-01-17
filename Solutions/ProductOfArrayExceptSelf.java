public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int prefix = 1;
        int suffix = 1;
        int[] result = new int[l];

        for (int i = 0; i < l; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        for (int i = l - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }


        return result;
    }
}
