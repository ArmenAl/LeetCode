package LeetCode_Easy;

public class LeetCode_796 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        rotateString(A, B);
    }

    public static boolean rotateString(String A, String B) {
        String str = A + A;

        if (A.length() == B.length() && str.contains(B)) {
            return true;
        }

        return false;
    }

}
