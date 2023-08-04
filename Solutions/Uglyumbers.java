public class Uglyumbers {
    public static void main(String[] args) {
        System.out.println("Is ugly number : "+String.valueOf(isUgly(14)));
    }
    public static boolean isUgly(int n) {
        if(n <= 0) return false;
        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;
        return n == 1; 
      }
}
