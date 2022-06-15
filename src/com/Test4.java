package com;

import java.util.Stack;

public class Test4 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode in = tx(node, 3);
        System.out.println(in.toString());
    }

    public static ListNode tx(ListNode head, int val) {
        ListNode node=null;
        if (head == null) {
            return head;
        }
        while(head.val==val){
            head=head.next;
        }
         if(head!=null){
            node=head;
            while(head.next!=null){
                if(head.next.val==val){
                    head.next=head.next.next;
                    head.next.next=null;
                }
                head=head.next;
            }
        }else{
             return head;
         }
         return node;
    }

}
