package LeetCode_Easy;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode_824 {
    public static void main(String[] args) {
       // String s = "I speak Goat Latin";

        String s = "The quick brown fox jumped over the lazy dog";
        toGoatLatin(s);
    }

    public static String toGoatLatin(String S) {
            S.toLowerCase();
            String[] str = S.split(" ");

            HashSet<Character> tmp = new HashSet<>();
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            for (int i = 0; i < vowels.length; i++) {
                tmp.add(vowels[i]);
            }

            StringBuilder result = new StringBuilder();
            int counter = 1;
            for (String s : str) {
                if (tmp.contains(s.charAt(0))) {
                    result.append(s.charAt(0));
                    result.append(s.substring(1));
                    result.append("ma");
                    for (int i = 0; i < counter; i++) {
                        result.append("a");
                    }
                } else {
                    char tmpChar = s.charAt(0);
                    result.append(s.substring(1));
                    result.append(tmpChar);
                    result.append("ma");
                    for (int i = 0; i < counter; i++) {
                        result.append("a");
                    }
                }
                counter++;
                result.append(" ");
            }

            result.deleteCharAt(result.length() - 1);
            System.out.println(tmp);
            System.out.println(result.toString());
            return result.toString();
        }
}
