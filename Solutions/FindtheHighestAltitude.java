
public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] arr = { -4, -3, -2, -1, 4, 3, 2};

        System.err.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(max, current);
        }

        return max;
    }
}