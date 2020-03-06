public class Main_1323 {
    public static void main(String[] args) {
        int a = 9669;
        int b = 9969;
        int c = 9999;
        maximum69Number(a);
        maximum69Number(b);
        maximum69Number(c);
    }

    public static int maximum69Number (int num) {
        System.out.println("in: " + num);
        StringBuilder str = new StringBuilder(String.valueOf(num));
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '6'){
                str.setCharAt(i, '9');
                i = str.length();
            }
        }
        int result = Integer.parseInt(str.toString());
        System.out.println("out: " + result);
        System.out.println("------------");

        return result;
    }
}
