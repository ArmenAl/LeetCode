package LeetCode_Easy;

import java.math.BigInteger;
import java.util.Arrays;

public class LeetCode_66 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // output: [1,2,4]
        int[] arr1 = {9, 9, 9}; // output: [1,0,0,0]
        plusOne(arr);
        plusOne(arr1);
    }

    public static int[] plusOne(int[] digits) {

        StringBuilder values = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            values.append((char) (48 + digits[i]));
        }

        BigInteger result = new BigInteger(values.toString());
        result = result.add(new BigInteger("1"));
        String values1 = result.toString();
        int[] res = new int[values1.length()];
        for (int i = 0; i < values1.length(); i++) {
            res[i] = values1.charAt(i) - 48;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
