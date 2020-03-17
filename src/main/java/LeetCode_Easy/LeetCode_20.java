package LeetCode_Easy;

import java.util.Stack;

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
        Stack<Character> strChar = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                strChar.push(c);
            } else if (c == ')') {
                if (strChar.isEmpty()) {
                    return false;
                }
                if (strChar.pop() != '(') {
                    return false;
                }
            }else if (c == '}') {
                if (strChar.isEmpty()) {
                    return false;
                }
                if (strChar.pop() != '{') {
                    return false;
                }
            }else if (c == ']') {
                if (strChar.isEmpty()) {
                    return false;
                }
                if (strChar.pop() != '[') {
                    return false;
                }
            }
        }
        return strChar.isEmpty();
    }
}