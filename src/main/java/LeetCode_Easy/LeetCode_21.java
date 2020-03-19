package LeetCode_Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_21 {
    public static void main(String[] args) {
        //  1->2->4, 1->3->4 => 1->1->2->3->4->4
        ListNode l1a = new ListNode(1);
        ListNode l1b = new ListNode(2);
        ListNode l1c = new ListNode(4);

        l1a.next = l1b;
        l1b.next = l1c;

        ListNode l2a = new ListNode(1);
        ListNode l2b = new ListNode(3);
        ListNode l2c = new ListNode(4);
        l2a.next = l2b;
        l2b.next = l2c;

        mergeTwoLists(l1a, l2a);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);

        if (head == null) {
            head = l1;
        } else {
            ListNode tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = l1;
        }

        while (true) {
            if (l1 == null) {
                head.next = l2;
            }
            if (l2 == null) {
                head.next = l1;
            }

            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }

            head = head.next;
            System.out.println();
            return head;
        }
    }
}

