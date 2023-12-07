public class MatchesIInTournament {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
    public static int numberOfMatches(int n) {
        int matches = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                matches += n / 2;
                n = n / 2;
            } else {
                matches += Math.round(n / 2);
                n = (n / 2) + 1;
            }
        }
        return matches;
    }
}
