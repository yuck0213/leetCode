package com.baijinjing.listNode;

public class Test {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);


        ListNode n2 = new ListNode(5);
        n2.next = new ListNode(6);
        n2.next.next = new ListNode(4);

        Solution solution = new Solution();

        ListNode head = solution.addTwoNumbers(n1, n2);

        while (head !=null){
            System.out.println(head.val);
            head = head.next;
        }


    }
}
