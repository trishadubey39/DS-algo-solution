public class RemoveNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 6, 7 };
        removeElement(arr, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]!=val){
                nums[index] = nums[i];
                index ++;
            }
        }

        return index;
    }
    \
}
