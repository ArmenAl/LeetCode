package LeetCode_Easy;

public class LeetCode_1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        //String s = "26#";
        freqAlphabets(s);
    }

    public static String freqAlphabets(String s) {

        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                String s1 = "" + s.charAt(i - 2) + s.charAt(i - 1);
                int val = Integer.parseInt(s1);
                str.insert(0, (char) (val + 96));
                i -= 2;
            } else {
                String s1 = "" + s.charAt(i);
                int val = Integer.parseInt(s1);
                str.insert(0, (char) (val + 96));
            }
        }
        //System.out.println(str.toString());
        return str.toString();
    }
}
