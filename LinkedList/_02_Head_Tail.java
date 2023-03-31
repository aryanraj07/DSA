package LinkedList;

import java.util.LinkedList;

public class _02_Head_Tail {
    public static class node{
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;

        }
        public static int head;
        public static int tail;


    }

    public static node head;
    public static node tail;
    public static void main(String[] args) {
        _02_Head_Tail ll=new _02_Head_Tail();
        ll.head=new node(1);
        ll.head.next=new node(2);





    }
}
