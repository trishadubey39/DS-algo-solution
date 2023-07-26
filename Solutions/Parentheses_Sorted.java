package Solutions;

public class Parentheses_Sorted {
    public static void main(String[] args) {
        System.out.println("Validity : " + isValid("()[]{}"));
        System.out.println("Validity : " + isValid("(}"));
    }

    public static boolean isValid(String s) {
        if (String.valueOf(s.charAt(s.length())) == ")" && (String.valueOf(s.charAt(s.length() - 1)) == "(")) {
            return true;
        } else if (String.valueOf(s.charAt(s.length())) == "}" && (String.valueOf(s.charAt(s.length() - 1)) == "{")) {
            return true;
        } else if (String.valueOf(s.charAt(s.length())) == "]" && (String.valueOf(s.charAt(s.length() - 1)) == "[")) {
            return true;
        } else
            return false;

    }
}
