package LeetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCode_202_Happy_Number {
    public static void main(String[] args) {
        int n = 19;
        isHappy(n);
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        int value = n;
        HashSet<Integer> valueHash = new HashSet();

        while (value != 1) {
            while (n > 0) {
                int rest = n % 10;
                sum += rest * rest;
                n = n / 10;
            }
            value = sum;

            if (valueHash.contains(value)) {
                return false;
            }
            valueHash.add(value);
            System.out.println(sum);
            n = value;
            sum = 0;
        }

        return true;
    }
}
