package LeetCode_Easy;

public class LeetCode_344 {
    public static void main(String[] args) {
        // ["h","e","l","l","o"]
        // ["H","a","n","n","a","h"]
    }
    public void reverseString(char[] s) {
        for(int i = 0, j = s.length-1; i < j ; i++, j--){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
