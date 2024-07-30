
import java.util.HashMap;
import java.util.Map;


public class RelativeSortArray {
    public static void main(String[] args) {
        
        int[] arr = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        int[] result = relativeSortArray(arr,arr2);
        for(int i : result){
            System.err.println(i);
        }
    }

        public static int[] relativeSortArray(int[] arr1, int[] arr2) {
            Map<Integer, Integer> map = new HashMap();
            int[] result = new int[arr1.length];
    
            for (int i = 0; i < arr1.length; i++) {
                if (map.containsKey(arr1[i])) {
                    map.put(arr1[i], (map.get(arr1[i]) + 1));
                } else {
                    map.put(arr1[i], 1);
                }
            }
    
            int index = 0;
            for (int i = 0; i < arr2.length; i++) {
                int count = map.get(arr2[i]);
                while (count > 0) {
                    result[index] = arr2[i];
                    index++;
                    count--;
                }
                map.remove(arr2[i]);
            }

            for(int i : map.keySet()){
                result[index] = i; 
                index++;
            }
            return result;
        }
    
}
