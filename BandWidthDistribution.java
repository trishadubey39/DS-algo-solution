import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BandWidthDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> bandWidths = new ArrayList<Integer>(Arrays.asList(100, 300, 500, 1000, 110, 110));
        ArrayList<Integer> request = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 85, 25));
        int total_bandwidth = 200;
        System.out.print(getMaxBandWidth(bandWidths, request, total_bandwidth));
    }

    public static long getMaxBandWidth(List<Integer> bandWidths, List<Integer> request, int total_bandwidth) {
        long sum = 0;
        for (int i = 0; i < bandWidths.size(); i++) {
            if (bandWidths.get(i) < total_bandwidth) {
                sum += request.get(i);
            }
        }

        return sum;
    }
}
