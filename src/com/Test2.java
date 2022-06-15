package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        int[] in= tx(node);
        System.out.println(in.toString());
    }

    public static int[] tx(ListNode head) {
        Stack queue=new Stack();
        int[] it={};
        boolean flag=true;
        while(flag){
            if(head==null){
                return it;
            }
            queue.add(head.val);
            if(head.next==null){
                flag=false;
            }else{
                head=head.next;
            }
        }
        int[] ints =new int[queue.size()];
        int size=queue.size();
        for(int i=0;i<size;i++){
            ints[i]=(int)queue.pop();
        }
        return  ints;
    }

}
