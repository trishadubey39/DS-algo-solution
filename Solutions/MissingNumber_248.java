
public class MissingNumber_248 {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Missing number is : " + String.valueOf(missingNumber(arr)));
    }

    public static int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ i + 1;
            num = num ^ nums[i];
        }
        return num;
    }
}
