package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_1252 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        oddCells(n, m, indices);
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int res = 0;
        int[][] matrix = new int[n][m];

        for (int[] rowCoc: indices) {
            for (int j = 0; j < m; j++) {
                matrix[rowCoc[0]][j]++;
            }
            for (int j = 0; j < n; j++) {
                matrix[j][rowCoc[1]]++;
            }
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                if (matrix[j][k] % 2 != 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
        return res;
    }
}
