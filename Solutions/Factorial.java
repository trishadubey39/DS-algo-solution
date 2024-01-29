import java.util.*;

public class Factorial {
    
    public static long factorial(long n) {
        // write your code here5
        long result = 1;
        long i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
