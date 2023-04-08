package com.baijinjing.deadLock.deviseNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList {

    public void reorderList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode cur = head;

        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }


    }
}
