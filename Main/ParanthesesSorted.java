package Main;

public class ParanthesesSorted {
    public static void main(String[] args) {
        System.out.println("Validity : " + isValid("()[]{}"));
        System.out.println("Validity : " + isValid("(}"));
    }

    public static boolean isValid(String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            a = a ^ s.toCharArray()[i];
        }

        if (a == 0) {
            return true;
        } else {
            return false;
        }

    }
}
