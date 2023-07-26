package Solutions;

import java.util.Stack;

public class RomanToNumber {
    public static void main(String[] args) {
        System.out.print(String.valueOf(romanToInt("XIX")));

    }

    public static int romanToInt(String s) {
        int number = 0;
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            switch (chars[i]) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
            }
            if (number * 4 < result) {
                result = result - number;
            } else {
                result = result + number;
            }
        }
        return result;
    }
}
