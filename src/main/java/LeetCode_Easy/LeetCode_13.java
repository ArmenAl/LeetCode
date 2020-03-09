package LeetCode_Easy;

public class LeetCode_13 {
    public static void main(String[] args) {
        String a = "III";
        String b = "IV";
        String c = "IX";
        String d = "LVII";
        String e = "MCMXCIV";
        romanToInt(a);
        romanToInt(b);
        romanToInt(c);
        romanToInt(d);
        romanToInt(e);
    }

    public static int romanToInt(String s) {
        int num = 0;

        for(int i = s.length()-1; i >= 0; i--){
            switch(s.charAt(i)) {
                case 'I':
                    if(num < 5){
                        num += 1;
                    }else {
                        num -= 1;
                    }
                    break;
                case 'V': num += 5;
                    break;
                case 'X':
                    if(num < 50){
                        num += 10;
                    }else {
                        num -= 10;
                    }
                    break;
                case 'L': num += 50;
                    break;
                case 'C':
                    if(num <500){
                        num += 100;
                    }else{
                        num -= 100;
                    }
                    break;
                case 'D': num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:
            }
        }
        System.out.println(num);
        return num;
    }
}
