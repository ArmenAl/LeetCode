package LeetCode_Easy;

public class LeetCode_14 {
    public static void main(String[] args) {
        String[] s1 = {"flower", "flow", "flight"};
        String[] s2 = {"dog", "racecar", "car"};

        longestCommonPrefix(s1);
        longestCommonPrefix(s2);
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int pointer = 0;
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(pointer);
            for (int j = 1; j < strs.length; j++) {
                if (pointer == strs[j].length() || strs[j].charAt(pointer) != c) {
                    System.out.println(result);
                    return result.toString();
                }
            }
            pointer++;
            result.append(c);
        }
        return result.toString();
    }
}
