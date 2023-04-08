package com.baijinjing.deadLock.deviseNode;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
            ListNode dummyHead = new ListNode();
            dummyHead.next = head;
            ListNode cur = dummyHead;
            while (cur.next != null) {
                if (cur.next.value == val) {
                    cur.next = cur.next.next;
                }else{
                    cur = cur.next;
                }
            }
            return dummyHead.next;
    }
}
