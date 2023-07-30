import java.util.Arrays;

public class LongetsCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String pre = strs[0];
        String post = strs[strs.length-1];
        int idx = 0;
        while(idx < pre.length() && idx < post.length()){
            if(pre.charAt(idx) == post.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return pre.substring(0, idx);
    }
}
