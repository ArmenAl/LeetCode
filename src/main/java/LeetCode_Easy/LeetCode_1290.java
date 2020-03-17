package LeetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LeetCode_1290 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;

        getDecimalValue(l1);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int getDecimalValue(ListNode head) {
        ListNode tmp = head;
        int counter = 0;
        while (tmp != null) {
            tmp = tmp.next;
            counter++;
        }

        ListNode tmp1 = head;
        int value = 0;
        while (tmp1 != null) {
            value += tmp1.val * (Math.pow(2, counter - 1));
            tmp1 = tmp1.next;
            counter--;
        }

        System.out.println(value);
        return value;
    }
}
