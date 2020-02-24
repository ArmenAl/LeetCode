public class Main_1351 {
    public static void main(String[] args) {
        int[][] m = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int[][] n = {{3, 2}, {1, 0}};
        int[][] p = {{1, -1}, {-1, -1}};
        int[][] q = {{-1}};

        countNegatives(m);
        countNegatives(n);
        countNegatives(p);
        countNegatives(q);
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
}
}
