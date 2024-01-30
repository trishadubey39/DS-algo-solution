public class GasStation {
    public static void main(String[] args) {

        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        GasStation e = new GasStation();
        System.out.println(e.canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost = 0;

        int curr_gas = 0, starting_point = 0;

        for (int i = 0; i < gas.length; i++) {
            total_cost += cost[i];
            total_gas += gas[i];
            curr_gas += gas[i] - cost[i];
            if (curr_gas < 0) {
                starting_point = i + 1;
                curr_gas = 0;
            }
        }
        if (total_gas < total_cost)
            return -1;

        return starting_point;
    }
}
