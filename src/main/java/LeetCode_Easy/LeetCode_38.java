package LeetCode_Easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        //System.out.println(countAndSay(4));
        //System.out.println(countAndSay(5));
        //System.out.println(countAndSay(6));
        //System.out.println(countAndSay(7));
        //System.out.println(countAndSay(8));
        //System.out.println(countAndSay(9));
        //System.out.println(countAndSay(10));
        //System.out.println(countAndSay(11));
        //System.out.println(countAndSay(12));
        //System.out.println(countAndSay(13));
    }
    // Todo
    public static String countAndSay(int n) {
        String str = "";
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n == 1) {
                counter++;
                str = String.valueOf(n);
            }
            if (n > 1 && n < 30) {
                counter++;
                str += String.valueOf(counter);
            }
        }
        System.out.println(str);
        return str;
    }
}