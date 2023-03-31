package LinkedList;

import java.util.LinkedList;

public class _04AddLast {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data )
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;

            }
            //2nd step
            newNode.next=head;
            head=newNode;

        }
        public void addLast(int data)
        {
            //create a new Node
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            //2nd step
            tail.next=newNode;
            //third step
            tail=newNode;

        }


    }
    public static void main(String[] args) {
        //adding a new node at the last of the linkedList
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);



    }
}
