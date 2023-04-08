package com.baijinjing.review;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyhead = new ListNode(-1);
            dummyhead.next = head;
            ListNode fast = new ListNode();
            ListNode slow = new ListNode();
            fast = dummyhead;
            slow = dummyhead;
            for (int i = 0; i <= n; i++) {
                fast=fast.next;
            }
            while (fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummyhead.next;
    }
}
