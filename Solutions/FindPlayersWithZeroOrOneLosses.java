import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindPlayersWithZeroOrOneLosses {
    public static void main(String[] args) {
        int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };
        System.out.println(findWinners(matches));
    }

    public static List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer, Integer> players = new HashMap<>();
        HashMap<Integer, Integer> loses = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();
        List<Integer> allWins = new ArrayList<>();

        for (int i = 0; i < matches.length; i++) {
            players.put(matches[i][0], 1);
            players.put(matches[i][1], 1);
            
            if (loses.containsKey(matches[i][1])) {
                loses.put(matches[i][1], loses.get(matches[i][1]) + 1);
            } else {
                loses.put(matches[i][1], 1);
            }
        }

        System.out.println(players);
        System.out.println(loses);

        for (Integer k : players.keySet()) {
            if(loses.containsKey(k)){
                if(loses.get(k)==1){
                    oneLose.add(k);
                }
            }else{
                allWins.add(k);
            }
        }
        Collections.sort(allWins);
        Collections.sort(oneLose);

        result.add(allWins);
        result.add(oneLose);

        return result;

    }

}
