package Stacks;

public class _02_LinkedLIst_Implementaiton {
    public static class Node{
        int data;
        Node next;
        //constructor for initialization
        public Node(int data)
        {
            this.data=data;
            this.next=null;

        }

    }
    public static class Stack{
        public static Node head;
       public static boolean isEmpty()
       {
           return head==null;
       }
        //push
        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop operation which is deleting the head of the linked list
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //pop operation: in Linked list we perform peek operation by returning head of the linked list
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        //Implementing stack using linked list
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
