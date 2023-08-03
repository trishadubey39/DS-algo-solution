package Solutions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BuddyString {
    public static void main(String[] args) {
        System.out.print(buddyStrings("ab", "ba"));
    }
    public static boolean buddyStrings(String s, String goal) {

        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
