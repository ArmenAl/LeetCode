package LeetCode_Easy;

public class LeetCode_1266 {
    public static void main(String[] args) {
        int[][] a = {{1,1},{3,4},{-1,0}};
        int[][] b = {{3,2},{-2,2}};
        minTimeToVisitAllPoints(a);
        minTimeToVisitAllPoints(b);
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int sec = 0;
        int sumX = 0;
        int sumY = 0;

        for(int i = 1; i < points.length; i++){
            sumX = Math.abs(points[i-1][0] - points[i][0]);
            sumY = Math.abs(points[i-1][1] - points[i][1]);
            sec += Math.max(sumX,sumY);
        }
        System.out.println("x: " + sumX +", y: " + sumY);
        System.out.println("--------");
        System.out.println(sec);
        System.out.println("--------");
        return sec;
    }
}
