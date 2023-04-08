package com.baijinjing.review;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode cur = dummyhead;
        while (cur.next != null && cur.next.next != null) {
            ListNode pre1 = cur.next;
            ListNode pre2 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = pre1;
            pre1.next = pre2;
            cur = cur.next.next;
        }
        return dummyhead.next;
    }
}
