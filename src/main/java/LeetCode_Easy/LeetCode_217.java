package LeetCode_Easy;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode_217 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 1};
        containsDuplicate(v);
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            if (!hashSet.add(i)) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
            }
        }
        return false;
    }
}
