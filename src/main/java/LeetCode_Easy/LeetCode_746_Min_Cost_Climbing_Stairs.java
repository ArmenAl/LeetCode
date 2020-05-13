package LeetCode_Easy;

public class LeetCode_746_Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        //int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        minCostClimbingStairs(cost);
    }

    public static int minCostClimbingStairs(int[] cost) {
        // TODO
        int count = 0;
        int maxStep = cost[0];

        if (cost.length > 0 && cost.length < 2) {
            if (maxStep > cost[1]) {
                return maxStep;
            } else {
                maxStep = cost[1];
                return maxStep;
            }
        }


        for (int i = 1; i < cost.length; i++) {
            if (cost[i] > maxStep) {
                maxStep = cost[i];
            }
        }

        for (int i = 0; i < cost.length; i++) {
            if(cost[i] < maxStep){
                count = cost[i];
            }
        }

        System.out.println(maxStep);

        return maxStep;
    }
}
