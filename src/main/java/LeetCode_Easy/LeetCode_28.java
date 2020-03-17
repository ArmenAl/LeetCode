package LeetCode_Easy;

public class LeetCode_28 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        strStr(haystack, needle);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
