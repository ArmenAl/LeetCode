public class Main_9 {
    public static void main(String[] args) {
        int a = 121;
        int b = -121;
        int c = 10;
        isPalindrome(a);
        isPalindrome(b);
        isPalindrome(c);
    }
    public static boolean isPalindrome(int x) {
        String tmpX = String.valueOf(x);
        StringBuilder tmpStr = new StringBuilder(tmpX);
        StringBuilder result = new StringBuilder(tmpStr.reverse());
        String res = result.toString();

        if(res.equals(tmpX)){
            System.out.println("true " + res);
            return true;
        }else {
            System.out.println("false " + res);
            return false;
        }
    }
}
