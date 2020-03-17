package LeetCode_Medium;

import java.util.HashMap;

public class LeetCode_1371 {
    public static void main(String[] args) {
        String s = "eleetminicoworoep"; // leetminicowor
        String s1 = "leetcodeisgreat"; // leetc
        String s2 = "bcbcbc"; // bcbcbc
        String s3 = "leetoppuuyt";


        findTheLongestSubstring(s);
        findTheLongestSubstring(s1);
        //findTheLongestSubstring(s2);
        //findTheLongestSubstring(s3);
    }


    public static int findTheLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (((i % 2 == 1) || (i % 2 == 0)) && (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                res--;
            } else if ((i % 2 == 0) && (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                {
                    res++;
                }
            }
            System.out.println(res);

        }
        return res;
    }
    //--- Example solution from LeetCode discussion
    /*static HashMap<Character, Integer> vowlToBitIndex = new HashMap<Character, Integer>() {
        {
            put('a', 1);
            put('e', 2);
            put('i', 4);
            put('o', 8);
            put('u', 16);
        }
    };


    public static int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> stateToIndex = new HashMap<>();
        stateToIndex.put(0, -1);
        int state = 0, maxLen = 0;
        for(int i = 0; i < s.length(); ++i) {
            char cur = s.charAt(i);
            if(vowlToBitIndex.containsKey(cur)) {
                // flap the digits of the state. 1-> 0 or 0 -> 1
                int bitToFlip = vowlToBitIndex.get(cur);
                state ^= bitToFlip;
            }

            stateToIndex.putIfAbsent(state, i);
            maxLen = Math.max(maxLen, i - stateToIndex.get(state));
        }

        return maxLen;
    }*/
}

