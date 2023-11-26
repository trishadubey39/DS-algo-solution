import java.util.Arrays;

public class ReverseAString{
    public static void main(String[] args){
        char[] ca = {'b','a','c','d'};
        // reverseString(ca);

    // System.out.println(isAnagram("anagram","nagaram"));
    System.out.println(isPalindrome("A man, a plan, a canal -- Panama"));
    }

    public static void reverseString(char[] s) {
        int m =0 , n = s.length-1;

        while(m<n){
            char temp = s[m];
            s[m] = s[n];
            s[n]= temp;
            m+=1;
            n-=1;
        }

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9_-]","").replaceAll("[_+$=-]", "").toLowerCase();
        int m =0 , n = t.length()-1;

        while(m<n){
            if(t.charAt(m)!=(t.charAt(n))){
                return false;
            }
            m++;
            n--;
        }
        return true;
    }
    

}