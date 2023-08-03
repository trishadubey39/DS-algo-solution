

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("34343 id Paindrom " + String.valueOf(isPalindrome(34343)));
        System.out.println("121 id Paindrom " + String.valueOf(isPalindrome(121)));
        System.out.println("242332 id Paindrom " + String.valueOf(isPalindrome(242332)));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0)
            return false;
        int check = 0;
        while (x > check) {
            check = check * 10 + x % 10;
            x /= 10;
        }
        return (x == check || x == check / 10);
    }
}
