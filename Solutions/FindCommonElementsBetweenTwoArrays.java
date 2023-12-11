import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        FindCommonElementsBetweenTwoArrays solution = new FindCommonElementsBetweenTwoArrays();
        int[] nums1 = { 4, 3, 2, 3, 1 };
        int[] nums2 = { 2, 2, 5, 2, 3, 6 };

        int[] result = solution.findIntersectionValues(nums1, nums2);

        // Print the result
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap1 = new HashMap<>();
        Map<Integer, Integer> countMap2 = new HashMap<>();

        int countInNums2 = 0;
        int countInNums1 = 0;

        for (int num : nums1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap1.keySet()) {
            if (countMap2.containsKey(num)) {
                countInNums1 += countMap2.get(num);

            }
        }

        for (int num : countMap2.keySet()) {
            if (countMap1.containsKey(num)) {
                countInNums2 += countMap1.get(num);
            }
        }

        return new int[] { countInNums2, countInNums1 };
    }
}
