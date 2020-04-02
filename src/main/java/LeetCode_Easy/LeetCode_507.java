package LeetCode_Easy;

public class LeetCode_507 {
    public static void main(String[] args) {
        int num = 25;
        checkPerfectNumber(num);
    }

    public static boolean checkPerfectNumber(int num) {

        if (num % 2 != 0) {
            return false;
        }
        int k = (int) Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= k; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        return sum == num;
    }
}
