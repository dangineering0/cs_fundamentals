package com.company.algo;

/**
 * Created by dangineering on 7/9/16.
 */
public class ReverseLL {


    public ListNode reverseList(ListNode head) {

        ListNode ans = head;

        while (head.next != null) {
            ans.next = head;
        }
        return null;
    }



    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

}
