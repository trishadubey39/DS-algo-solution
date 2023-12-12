import java.util.*;;

public class ThreeSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();

        for (int i = 0; i < nums.length - 3; i++) {
            if ((nums[i] != nums[i + 1] || nums[i] != nums[i + 2] || nums[i + 1] != nums[i + 2])
                    && (nums[i] + nums[i + 1] + nums[i + 2] == 0)) {
                List<Integer> d = new ArrayList();
                d.add(nums[i]);
                d.add(nums[i + 1]);
                d.add(nums[i + 2]);
                list.add(d);
            }
        }

        return list;
    }
}
