package LeetCode_Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class LeetCode_804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        //String[] words = {"a", "b", "c", "d"};
        uniqueMorseRepresentations(words);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        //char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
        String[] morseAlfabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<String>();
        for (String word : words) {
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                result.append(morseAlfabet[word.charAt(j) - 97]);
            }
            set.add(result.toString());
        }
        System.out.println(set.size());
        return set.size();
    }
}
