public class Main_1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        String s1 = "RLLLLRRRLR";
        balancedStringSplit(s);
        balancedStringSplit(s1);
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result++;
            }
        }

        System.out.println(result);
        return result;
    }
}
