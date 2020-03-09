package LeetCode_Easy;

public class LeetCode_7 {
    public static void main(String[] args) {
        int a = 123;
        int b = -123;
        int c = 120;
        reverse(a);
        reverse(b);
        reverse(c);
    }

    public static int reverse(int x) {
        long reversed = 0;
        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        int result = (int) reversed;
        if (result != reversed) {
            return 0;
        }
        System.out.println(result);
        return result;
    }
}
