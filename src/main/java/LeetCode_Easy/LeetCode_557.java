package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }

    public static String reverseWords(String s) {
       /* StringBuilder strng = new StringBuilder(s);
        strng.reverse();
        String tmp = strng.toString();*/
        String[] str = s.split(" ");
        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            String ss = str[i];
            str[i] = str[j];
            str[j] = ss;
        }
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result += str[i] + " ";
        }
        result.substring(0,result.length() - 1);
        System.out.println(result);
        return result;
    }
}
