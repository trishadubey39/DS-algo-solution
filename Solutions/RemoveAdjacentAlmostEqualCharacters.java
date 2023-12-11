import java.util.HashMap;
import java.util.Map;

public class RemoveAdjacentAlmostEqualCharacters {

    public static void main(String[] args) {

        System.out.println("Output 1: " + removeAlmostEqualCharacters("zyxyxyz"));
    }

    public static int removeAlmostEqualCharacters(String word) {
        char[] chars = word.toCharArray();
        int operations = 0;
        int n = chars.length;
        for (int i = 1; i < n; i++) {
            // System.out.println((char)chars[i ]);
            // System.out.println(((char)(chars[i-1])));
            if (chars[i] == (char)chars[i - 1] || (char)chars[i - 1] == (char)(chars[i] - 1)||(char)chars[i - 1] == (char)(chars[i] + 1)) {
                operations++;
                if (i + 1 < n && chars[i] == chars[i + 1]) {
                    chars[i + 1] = (char) ((chars[i] - 23));
                } else {
                    chars[i] = (char) ((chars[i] - 'a' + 1) % 26 + 'a');
                }
            }
        }

        return operations;
    }

        public int maxSubarrayLength(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLen = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        while (right < nums.length) {
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1);
            right++;

            while (frequencyMap.size() > k) {
                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
                if (frequencyMap.get(nums[left]) == 0) {
                    frequencyMap.remove(nums[left]);
                }
                left++;
            }

            // Check if the current window is good
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
