package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_136 {

    public static void main(String[] args) {
        int[] n = {2, 2, 1};
        int[] n1 = {4, 1, 2, 1, 2};
        System.out.println(4^1^2^1^2);
        singleNumber(n);
        singleNumber(n1);
    }

    public static int singleNumber(int[] nums) {

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i];
        }
        System.out.println(x);
        return x;
    }
}
