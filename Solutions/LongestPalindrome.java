import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bananas"));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        boolean one = false;
        int sum = 0;
        for (char i : s.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.putIfAbsent(i, 1);
            }
        }

        for (int i : map.values()) {
            if (i == 1 && !one) {
                one = true;
                sum += 1;
            }
            if (i > 1 && i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = "";
        String sec = "";

        for (String s : word1) {
            first+=s;
        }
        for (String s : word2) {
            sec+=s;
        }

        return first.equals(sec);
    }
}
