package com.baijinjing.deadLock.deviseNode;

public class Test {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);
        n1.next.next.next.next = new ListNode(5);

        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(5);
        n2.next.next.next = new ListNode(7);
        n2.next.next.next.next = new ListNode(9);

//        ReverseListNode2 reverseListNode = new ReverseListNode2();
//        ListNode head = reverseListNode.reverseList(n1);

//        SwapPairs swapPairs = new SwapPairs();
//        ListNode head = swapPairs.swapPairs(n1);

//        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
//        ListNode head = removeNthFromEnd.removeNthFromEnd(n1, 3);

//        ReorderList reorderList = new ReorderList();
//        reorderList.reorderList(n1);
//        ListNode head = n1;

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode head = mergeTwoLists.mergeTwoLists2(n1, n2);

        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }

    }
}
