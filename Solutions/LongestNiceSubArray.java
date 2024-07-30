import java.util.Arrays;

public class LongestNiceSubArray {
        public static void main(String[] args) {

        int[] nums2 = {1,3,8,48,10};
        System.out.println(longestNiceSubarray(nums2));
    }

    public static int longestNiceSubarray(int[] nums) {
        int i,j,n=nums.length,res,max=1;
        for(i=j=res=0;j<n;){
            if((res&nums[j])>0){
                res=res^nums[i];
                i++;
            }else{
                res=res|nums[j];
                j++;
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}
