package Solutions;

public class MaxMidnumber {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 15, 55, 88, 17, 14, 13, 3 };
        System.out.println(findNumber(arr));
    }

    public static int findNumber(int nums[]) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
