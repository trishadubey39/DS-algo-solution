package Main;

import java.util.HashMap;
import java.util.Map;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 3, 4, 8, 4, 7, 5, 5, 2, 6, 7, 9 };
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        System.out.println("First non repitative value is : " + ans);
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // map.put(arr[i], map.get(arr[i]) + 1);
        // } else {
        // map.put(arr[i], 1);
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (map.get(arr[i]) == 1) {
        // System.out.println("First non repitative value is : " + arr[i]);
        // break;
        // }
        // }
    }
}
