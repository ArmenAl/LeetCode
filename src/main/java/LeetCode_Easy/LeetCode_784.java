package LeetCode_Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode_784 {
    public static void main(String[] args) {
        String s = "a1b2";
        //String s = "3z4";
        //String s = "12345";
        //String s = "a1b23C";
        letterCasePermutation(s);
    }

    public static List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();

        list.add(S);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 65 && c <= 122) {
                int l = list.size();
                for (int j = 0; j < l; j++) {
                    char[] word = list.get(j).toCharArray();
                    if (c >= 65 && c <= 90) {
                        word[i] = (char) (c + 32);
                    }
                    if (c >= 97 && c <= 122) {
                        word[i] = (char) (c - 32);
                    }
                    list.add(String.valueOf(word));
                }
            }
        }


        System.out.println(list);
        return list;
    }
}


   /* // Iterative solution
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        if(S == null || S.length() == 0){
            return result;
        }
        result.add(S);
        for(int i = 0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                int l = result.size();
                for(int j = 0;j<l;j++){
                    char[] word = result.get(j).toCharArray();
                    if(Character.isUpperCase(word[i])){
                        word[i] = Character.toLowerCase(word[i]);
                    }else{
                        word[i] = Character.toUpperCase(word[i]);
                    }
                    result.add(String.valueOf(word));
                }
            }
        }
        return result;
    }*/