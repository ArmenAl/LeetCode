package LeetCode_Easy;

import java.sql.PreparedStatement;

public class LeetCode_1281 {
    public static void main(String[] args) {
        int n = 234;
        subtractProductAndSum(n);
    }

    public static int subtractProductAndSum(int n) {
        String numToString = "" + n;
        int result;
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numToString.length(); i++) {
            String tmpNum = "" + numToString.charAt(i);
            sum = sum + Integer.parseInt(tmpNum);
            product = product * Integer.parseInt(tmpNum);
        }
        result = product - sum;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Result: " + result);
        return result;

        /*int sum = 0;
        int prod = 1;
        while(n != 0){
            System.out.println(n % 10);
            sum += n%10;
            //System.out.println(sum);
            prod *= n%10;
            //System.out.println(prod);
            n /= 10;
            System.out.println(n /= 10);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("Result: " + (prod - sum));
        return prod - sum;*/

    }
}
