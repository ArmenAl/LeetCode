package LeetCode_Easy;

import java.util.HashMap;

public class LeetCode_788 {
    public static void main(String[] args) {
        int N = 10000;

        System.out.println(rotatedDigits(N));
    }

    public static int rotatedDigits(int N) {
        int count = 0;
        int[] map = {0, 1, 5, -1, -1, 2, 9, -1, 8, 6};

        for (int i = 1; i <= N; i++) {
            boolean flag = true;
            int val = 0;
            int ten = 1;
            int n = i;

            while (n != 0) {
                int r = n % 10;
                if (map[r] < 0) {
                    flag = false;
                    break;
                }
                val = (map[r] * ten) + val;
                ten *= 10;
                n /= 10;
            }

            if(flag && val != i){
                count++;
            }
        }
        return count;
    }
}
