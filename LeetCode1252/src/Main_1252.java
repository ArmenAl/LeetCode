import java.util.Arrays;

public class Main_1252 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        oddCells(n, m, indices);
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int res = 0;
        int[][] zero = new int[n][m];
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                zero[i][j] = 0;
            }
            System.out.println(Arrays.toString(zero[i]));

        }

        for (int p = 0; p < indices.length; p++) {
            int[] pair = indices[p];
            System.out.println(Arrays.toString(pair));
            matrix[pair[p]][pair[p]] = zero[pair[p]][pair[p]] + 1;
            //System.out.println(Arrays.toString(matrix[i]));
        }

        return res;
    }
}
