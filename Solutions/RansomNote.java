
import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m = new HashMap<>();
        HashMap<Character, Integer> r = new HashMap<>();

        for (int i = 0; i < magazine.toCharArray().length; i++) {
            if (m.containsKey(magazine.charAt(i))) {
                m.put(magazine.charAt(i), m.get(magazine.charAt(i)) + 1);
            } else {
                m.put(magazine.charAt(i), 1);
            }
        }

        for (int i = 0; i < ransomNote.toCharArray().length; i++) {
            if (r.containsKey(ransomNote.charAt(i))) {
                r.put(ransomNote.charAt(i), r.get(ransomNote.charAt(i)) + 1);
            } else {
                r.put(ransomNote.charAt(i), 1);
            }
        }
        for (Character k : r.keySet()) {
            if (m.containsKey(k)) {
                System.out.println(r.get(k));
                System.out.println(m.get(k));
                if (!(r.get(k) <= m.get(k))) {
                    return false;
                }
            }else{
                return false;
            }

        }

        return true;
    }
}
