package LeetCode_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_890 {
    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"}; // ["mee","aqq"]
        String pattern = "abb";

        findAndReplacePattern(words, pattern);
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();

        int[] p = new int[26];
        for (int i = 0; i < pattern.length(); i++) {
           int tmpP = pattern.charAt(i) - 97;
        }
        System.out.println(Arrays.toString(p));

        for (String word : words) {
            int[] w = new int[26];
            for (int i = 0; i < word.length(); i++) {
                int tmpW = (word.charAt(i) - 97);
            }
            System.out.println(Arrays.toString(w));
        }

        return list;
    }
}


   /* List<String> res = new ArrayList();
    int pLen = pattern.length();
        for (String word : words) {
                int[] w = new int[26];
                int[] p = new int[26];
                boolean matches = true;
                for (int i = 0; i < pLen; i++) {
        int wCh = word.charAt(i) - 'a';
        int pCh = pattern.charAt(i) - 'a';
        if (w[wCh] != p[pCh]) {
        matches = false;
        break;
        }
        w[wCh] = p[pCh] = i + 1;
        }
        if (matches)
        res.add(word);
        }
        return res;*/