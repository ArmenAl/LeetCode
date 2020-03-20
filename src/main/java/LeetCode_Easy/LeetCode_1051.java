package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_1051 {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        heightChecker(heights);
    }

    public static int heightChecker(int[] heights) {
        int[] tmpHeights = heights.clone();
        int counter = 0;
        Arrays.sort(tmpHeights);
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(tmpHeights));
        for(int i = 0; i < heights.length; i++) {
            if (tmpHeights[i] != heights[i]) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
