package LeetCode_Medium;

import java.util.Arrays;

public class LeetCode_541 {
    public static void main(String[] args) {
        //String s = "Let's take LeetCode contest";
        String s = "a good   example";
        reverseWords(s);

    }

    public static String reverseWords(String s) {
        if(s.length() == 0 || s.equals(" ")){
            return "";
        }
        String[] str = s.split(" ");
        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            String ss = str[i];
            str[i] = str[j];
            str[j] = ss;
        }
        //System.out.println(Arrays.toString(str));
        String result = "";
        String ans = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0) {
                result += str[i].trim() + " ";
            }
        }

        System.out.println(result);
        return result.trim();
    }
}
