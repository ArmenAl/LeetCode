package LeetCode_Easy;

public class LeetCode_1295 {
    public static void main(String[] args) {
        int[] n = {12, 345, 2, 6, 7896};
        int[] m = {555, 901, 482, 1771};
        findNumbers(n);
        findNumbers(m);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) count++;
        }
        System.out.println(count);
        return count;
    }
}
