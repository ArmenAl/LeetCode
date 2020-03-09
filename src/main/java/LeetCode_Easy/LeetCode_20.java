package LeetCode_Easy;

public class LeetCode_20 {
    public static void main(String[] args) {
        String s = "()";
        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "{[]}";
        isValid(s);
        isValid(s1);
        isValid(s2);
        isValid(s3);

    }

    public static boolean isValid(String s) {
        if(s.length()%2 != 0) {
            return false;
        }else {

        }

        return true;
    }
}
