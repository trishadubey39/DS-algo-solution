import java.util.Arrays;

public class CountNicePairsinanArray{
    public static void main(String[] args){
        int[] ca = {13,10,35,24,76};
        System.out.println(countNicePairs(ca));
    }

    public static int countNicePairs(int[] nums) {
        int count =0;
        int[] rev = nums;

        for (int i =0;i < rev.length;i++){
            rev [i] = reverseNumber(rev[i]);
        }


        for(int i =0;i < nums.length;i++){
            for(int j =i;j < nums.length;j++){
                if(nums[i]<nums[j]&&nums[i] + rev[j] == nums[j] + rev[i]){
                    count++;
                }
            } 
        }        
        return count ; 
    }

    public static int reverseNumber(int num){
        int rev_num = 0; 
        while (num > 0) { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
    } 

    

}