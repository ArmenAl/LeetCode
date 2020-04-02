package LeetCode_Easy;

import java.util.*;

public class LeetCode_500 {
    public static void main(String[] args) {
        String[] s = {"Hello", "Alaska", "Dad", "Peace"}; //["Alaska", "Dad"]
        findWords(s);
    }

    public static String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();

        String charRaw1 = "qwertyuiop";
        String charRaw2 = "asdfghjkl";
        String charRaw3 = "zxcvbnm";

        HashSet<Character> charsRawCounter1 = new HashSet<>();
        HashSet<Character> charsRawCounter2 = new  HashSet<>();
        HashSet<Character> charsRawCounter3 = new  HashSet<>();

        char[] raw1 = charRaw1.toCharArray();
        char[] raw2 = charRaw2.toCharArray();
        char[] raw3 = charRaw3.toCharArray();
        for (int i = 0; i < raw1.length; i++) {
            charsRawCounter1.add(raw1[i]);
        }
        for (int i = 0; i < raw2.length; i++) {
            charsRawCounter2.add(raw2[i]);
        }
        for (int i = 0; i < raw3.length; i++) {
            charsRawCounter3.add(raw3[i]);
        }


        for (String w : words) {
            char[] tmpW = w.toLowerCase().toCharArray();
            boolean flag = true;
            flag = isFlag(res, charsRawCounter1, w, tmpW, flag);
            flag = isFlag(res, charsRawCounter2, w, tmpW, flag);

            isFlag(res, charsRawCounter3, w, tmpW, flag);
        }

        String[] result = new String[res.size()];
        for (int i = 0; i < result.length ; i++) {
            result[i] = res.get(i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static boolean isFlag(List<String> res, HashSet<Character> charsRawCounter, String w, char[] tmpW, boolean flag) {
        for (int i = 0; i < tmpW.length; i++) {
            if (!charsRawCounter.contains(tmpW[i])) {
                flag = false;
                break;
            }
        }
        if (flag) {
            res.add(w);
        }
        flag = true;
        return flag;
    }
}
