package LeetCode_Easy;

public class LeetCode_5337 {
    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        String s1 = "leetcodeisgreat";
        String s2 = "bcbcbc";

        findTheLongestSubstring(s);
        findTheLongestSubstring(s1);
        findTheLongestSubstring(s2);
    }

    public static int findTheLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2 == 1) && (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                res--;
            }else
                res++;
        }
        System.out.println(res);
        return res;
    }

}
