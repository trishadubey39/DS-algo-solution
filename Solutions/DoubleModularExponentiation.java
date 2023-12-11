import java.util.*;

public class DoubleModularExponentiation {

    public static List<Integer> findGoodIndices(int[][] variables, int target) {
        List<Integer> goodIndices = new ArrayList<>();

        for (int i = 0; i < variables.length; i++) {
            int a = variables[i][0];
            int b = variables[i][1];
            int c = variables[i][2];
            int m = variables[i][3];

            double v = (Math.pow((Math.pow(a , b) % 10) , c)) % m;
            System.out.println(v);
            if ((Math.pow((Math.pow(a , b) % 10) , c)) % m== 0 ) {
                goodIndices.add(0);
            } else if (((a * b % 10) * c) % m == target) {
                goodIndices.add(i);
            }
        }

        int count =0;
        for(int v : goodIndices){
            if(v == 0 ){
                count ++ ;
            }
            if(count==goodIndices.size()){
                return new ArrayList<>();
            }
        
        }

        return goodIndices;
    }

    public static void main(String[] args) {
        int[][] variables = { { 2, 3, 3, 10 }, { 3, 3, 3, 1 }, { 6, 1, 1, 4 } };
        int target = 2;
        List<Integer> result = findGoodIndices(variables, target);

        System.out.println(result);
    }
}
