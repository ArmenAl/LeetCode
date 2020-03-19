package LeetCode_Easy;

public class LeetCode_1374 {
    public static void main(String[] args) {
        generateTheString(5);
    }

    public static String generateTheString(int n) {
        StringBuilder str = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                str.append('a');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                str.append('a');
            }
            str.append('b');
        }
        System.out.println(str);
        return str.toString();
    }
}
