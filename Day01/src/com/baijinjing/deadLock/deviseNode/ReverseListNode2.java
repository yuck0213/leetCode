package com.baijinjing.deadLock.deviseNode;

public class ReverseListNode2 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }

        ListNode temp = cur.next;
        cur.next = pre;
        return reverse(temp, cur);
    }
}
