package Solutions;

public class Powx_n {
    public static void main(String[] args) {
        System.out.print(myPow(1.0000000000001, -2147483648));
    }

    public static double myPow(double x, int n) {
        double num = x;
        int p = Math.abs(n);
        if (n == 0)
            return 1;
        if (x == 1)
            return 1;
        if (x == -1)
            return (n % 2 == 0 ? 1 : -1);
        if (p % 2 == 0) {
            p = Math.abs(n / 2);
            for (int i = 1; i < p; i++) {
                num *= x;
            }
            num *= num;
        } else {
            for (int i = 0; i < p - 1; i++) {
                num *= x;
            }
        }

        if (n < 0) {
            return 1 / num;
        }
        return num;
    }
}