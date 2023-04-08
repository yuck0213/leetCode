package com.baijinjing.deadLock.deviseNode;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (list1.next != null && list2.next != null) {
            if (list1.value <= list2.value) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = list1 == null ? list2 : list1;

        return prehead.next;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if (list1.value <= list2.value) {
            list1.next = mergeTwoLists2(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists2(list1,list2.next);
            return list2;
        }
    }
}
