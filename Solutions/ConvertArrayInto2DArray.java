import java.util.*;

public class ConvertArrayInto2DArray {
    public static void main(String[] args) {
        ConvertArrayInto2DArray c = new ConvertArrayInto2DArray();
        int[] nums = { 1, 3, 4, 1, 2, 3, 1 };
        List<List<Integer>> lists = c.findMatrix(nums);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i) + " :: ");
            }
        }
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                temp.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);
                if (entry.getValue() == 0) {
                    iterator.remove(); 
                }
            }
            ans.add(temp);
        }

        return ans;
    }
}
