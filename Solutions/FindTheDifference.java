import java.util.Arrays;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abbbcc"));
    }
    public static String findTheDifference(String s) {
        char[] chars = s.toCharArray();
        String result=chars[0]+"";

        Arrays.sort(chars);

        for(int i=1;i<chars.length; i++){
            if(chars[i-1]!=chars[i]){
                result+=chars[i];
            }
        }
        return result;

    }
}
