package LeetCode_Easy;

import java.util.HashMap;

public class LeetCode_389_Find_the_Difference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {

      /*  char[] strS = s.toCharArray();
        char ans = ' ';
        for (char c: strS) {
            for (int i = 0; i < t.length(); i++) {
                if(!(t.charAt(i) == c)){
                    ans = t.charAt(i);
                }
            }
        }*/
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
        char sum = strT[strT.length - 1];
        for (int i = 0; i < strS.length; i++) {
            sum ^= strS[i] ^ strT[i];
        }


        return  sum;
    }
}
