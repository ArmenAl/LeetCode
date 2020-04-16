package LeetCode_Easy;

public class LeetCode_463 {
    public static void main(String[] args) {
        int[][] g = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}}; // 16

        islandPerimeter(g);
    }

    public static int islandPerimeter(int[][] grid) {
        int down = 0;
        int right = 0;
        int stripes = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    stripes++;
                    if((i + 1) < grid.length && grid[i+1][j] == 1){
                        right++;
                    }
                    if((j + 1) < grid[0].length && grid[i][j+1] == 1){
                        down++;
                    }
                }
            }
        }

        System.out.println(stripes *4 - right*2 - down*2);
        return stripes;
    }
}
