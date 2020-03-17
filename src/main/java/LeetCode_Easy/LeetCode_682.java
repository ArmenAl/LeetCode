package LeetCode_Easy;

import java.util.Stack;

public class LeetCode_682 {
    public static void main(String[] args) {
        String[] s = {"5", "-2", "4", "C", "D", "9", "+", "+"}; //{"5", "2", "C", "D", "+"};
        calPoints(s);
    }

    public static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> str = new Stack<>();

        if (ops.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < ops.length; i++) {
                if (ops[i].equals("C")) {
                    sum -= str.pop();
                } else if (ops[i].equals("D")) {
                    sum += str.push(2 * str.peek());
                } else if (ops[i].equals("+")) {
                    int lastValue = str.pop();
                    int newValue = str.peek() + lastValue;
                    str.push(lastValue);
                    str.push(newValue);
                    sum += newValue;
                } else {
                    sum += str.push(Integer.parseInt(ops[i]));
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}
