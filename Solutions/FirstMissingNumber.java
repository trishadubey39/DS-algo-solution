import java.util.Arrays;

public class FirstMissingNumber {
    
    public static void main(String[] args) {

        int[] arr = {-1,1,2,4};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int minVal = 1;
        int result = 1;
        int prev =-1;
        boolean one = false;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                minVal = nums[i];
                break;
            }
        }


        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(nums[i]==1){
                    one = true;
                }
                result = result ^ minVal;
                result = result ^ nums[i];
                if(prev!=nums[i]){
                    minVal ++;
                }
                prev =nums[i];
            }
           
        } 

         if(one && result==1) return 2; else if(one) return result ;else return 1;
        
    }

}
