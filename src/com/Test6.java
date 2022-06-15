package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test6 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode in = tx(node);
        System.out.println(in.toString());
    }

    public static ListNode tx(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        if (head != null) {
            list.add(head);
            while (head.next != null) {
                head = head.next;
                list.add(head);
            }
        }
        ListNode result=list.get(list.size()/2);
        return result;
    }
}
