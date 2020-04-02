package LeetCode_Easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_728 {
    public static void main(String[] args) {
        int left = 1, right = 22;
        selfDividingNumbers(left, right);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                System.out.println(i);
                list.add(i);
            }
        }

        return list;
    }

    private static boolean isSelfDividing(int i) {
        int val = i;
        while (val > 0) { // 128
            int r = val % 10;
            if (r == 0 || i % r != 0) {
                return false;
            }
            val = val / 10;
        }
        return true;
    }
}
