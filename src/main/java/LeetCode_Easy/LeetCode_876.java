package LeetCode_Easy;

import java.util.ArrayList;

public class LeetCode_876 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        middleNode(l1);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode middleNode(ListNode head) {
            int i = 0;
            ListNode tmp = head;
            ArrayList<ListNode> tmpArr = new ArrayList<>();
            while (tmp != null) {
                //System.out.println(tmp.val);
                tmpArr.add(tmp);
                tmp = tmp.next;
                i++;
            }

            return tmpArr.get(i / 2);
        }
}
