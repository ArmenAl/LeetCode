package LeetCode_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_1002 {
    public static void main(String[] args) {
        String[] s = {"bella", "label", "roller"};
        String[] s1 = {"cool", "lock", "cook"};
        commonChars(s);
        commonChars(s1);
    }

    public static List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<String>();
        if (A == null || A.length == 0) return ans;

        HashMap<Character, Integer> charVal = new HashMap<>();
        for (int i = 0; i < A[0].length(); i++) {
            charVal.put(A[0].charAt(i), charVal.getOrDefault(A[0].charAt(i), 0) + 1);
        }

        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (int j = 0; j < A[i].length(); j++) {
                char curr = A[i].charAt(j);
                if (charVal.containsKey(curr))
                    temp.put(curr, Math.min(charVal.get(curr), temp.getOrDefault(curr, 0) + 1));
            }
            charVal = temp;
        }

        for (char c : charVal.keySet()) {
            for (int i = 0; i < charVal.get(c); i++) ans.add(String.valueOf(c));
        }
        System.out.println(ans);
        return ans;
    }
}

 /*for (String s : A) {
         for (char c : s.toCharArray()) {
         arr[c]++;
         }
         }

         List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
        if (arr[i]!=0&&arr[i] % 3 == 0) {
        list.add(String.valueOf((char)i));
        }
        }
        return list;*/