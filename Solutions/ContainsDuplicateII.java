import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs((i-map.get(nums[i]))) <= k){
                    return true;
                }  
            }

            map.put(nums[i], i);
        }
        return false;
    }
}
