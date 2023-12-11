import java.util.*;
public class FindMAxSubArrayWithK {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 3, 3 };
        int k = 2;
        long output = countSubarrays(nums, k);
        System.out.println(output);
    }

    public static long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] countRight = new int[n];
        Stack<Integer> stack = new Stack<>();
        long result = 0;

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                stack.pop();
            }
            countRight[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        stack.clear();

        for (int i = 0; i < n; i++) {
            int countLeft = 1;
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                countLeft += countRight[stack.pop()];
            }
            stack.push(i);

            if (countLeft >= k) {
                result += countRight[i] * (countLeft - k + 1);
            }
        }

        return (int) (result % (1e9 + 7));
    }

    private static int findMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    
}
