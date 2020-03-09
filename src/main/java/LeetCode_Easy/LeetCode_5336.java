package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_5336{ // 5336
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        increasingDecreasingString(s);
    }

    public static String increasingDecreasingString(String s) {
        int[] resInt = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int val = ch;
            resInt[i] = val;
            //System.out.print(val);
        }

        int[] resInt1 = new int[s.length()];
        for(int j = resInt.length - 1; j >= 0; j--){
                resInt1[j] = resInt[j];
        }
        System.out.print(Arrays.toString(resInt1));


        return null;
    }
}
