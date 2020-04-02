package LeetCode_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode_1160 {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        //String[] words = {"hello","world","leetcode"};
        //String chars = "welldonehoneyr";
        countCharacters(words, chars);
    }

    public static int countCharacters(String[] words, String chars) {

        char[] charsArr = new char[26];
        for (char c : chars.toCharArray()) {
            charsArr[c - 'a']++;
        }

        int sum = 0;

        for (String w : words) {
            char[] charsWord = new char[26];
            char[] tmpW = w.toCharArray();
            boolean flag = true;
            for (char c : tmpW) {
                if (charsWord[c - 'a'] == charsArr[c - 'a']) {
                    flag = false;
                    break;
                } else {
                    charsWord[c - 'a']++;
                }
            }
            if (flag) {
                sum += w.length();
            }
        }

        System.out.println(sum);

        return sum;
    }
}
