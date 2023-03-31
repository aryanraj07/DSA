package LinkedList;

import java.util.LinkedList;

public class _05Print_Linked_List {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            Node next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public void addFirst(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public  void addLast(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }

   public void print()
   {
       if(head==null)
       {
           System.out.println("Linked List is empty");
           return;
       }
       Node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.data+"->");
           temp=temp.next;
           
       }
       System.out.println("null");
   }



    public static void main(String[] args) {
        //printing a linked list
        //we will use a temp variable for traversing the linkedList
        _05Print_Linked_List ll=new _05Print_Linked_List();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();

    }
}
