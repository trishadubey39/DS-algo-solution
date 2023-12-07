public class MoneyInLeetCode {
    public static void main(String[] args) {
        System.out.println(totalMoney(10));
    }
    
    public static int totalMoney(int n) {
        int k = 1;
        int result = 0;
        while (n > 0) {
            if (n >= 7) {
                result += 7 / 2 * ((2 * k) + 6);
                k++;
                n = n - 7;
            } else {
                result += n / 2 * ((2 * k) + (n - 1));
                n = 0;
            }
        }
        return result;
    }
}
