package LeetCode_Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_888 {
    public static void main(String[] args) {
        //int[] A = {1, 1};
        //int[] B = {2, 2};
        //int[] A = {1, 2, 5}; //[5,4]
        //int[] B = {2, 4};
        int[] A = {35, 17, 4, 24, 10}; // [24,21]
        int[] B = {63, 21};

        fairCandySwap(A, B);
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] result = new int[2];

        int sumA = 0;
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }
        int sumB = 0;
        for (int i = 0; i < B.length; i++) {
            sumB += B[i];

        }
        // TODO
        Set<Integer> setB = new HashSet();
        for (int x: B) setB.add(x);
        int d = (sumB - sumA) / 2;

        for (int r : A) {
            System.out.println(r+d);
            if (setB.contains(r + d)) {
                result = new int[]{r, r + d};

            }

        }

        return result;
    }
}
