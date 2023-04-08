package com.baijinjing.deadLock.deviseNode;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummyHead = new ListNode();
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        dummyHead.next= head;
        ListNode cur = dummyHead;
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
