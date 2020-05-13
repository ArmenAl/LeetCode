package LeetCode_Easy;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.HashMap;

public class LeetCode_860 {
    public static void main(String[] args) {
        //int[] m = {5, 5, 10};
        int[] m = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};
        lemonadeChange(m);
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                ten++;
                five--;
                if (five < 0) {
                    return false;
                }
            } else {
                if(ten > 0){
                    ten--;
                    five--;
                }else {
                    five-=3;

                }
                if (five < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}