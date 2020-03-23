package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_908 { // TODO
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int K = 1;
        //int[] A = {1, 3, 6};
        //int K = 3;
        smallestRangeI(A, K);
    }

    public static int smallestRangeI(int[] A, int K) {
        int[] B = new int[A.length];

        for (int j = -K; j <= K; j++) {
            for (int i = 0; i < A.length; i++) {
                B[i] = j + A[i];
            }
            System.out.println(Arrays.toString(B));
        }

        return 0;
    }
}
