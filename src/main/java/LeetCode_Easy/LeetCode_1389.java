package LeetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        createTargetArray(nums, index);
    }
    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> tmpTarget = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            tmpTarget.add(index[i],nums[i]);
        }
        int[] target = tmpTarget.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(target));
        return target;
    }
}
