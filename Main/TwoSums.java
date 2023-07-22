package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 10, 12, 14 };
        int target = 14;
        int[] output = twoSum(arr, target);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }
}