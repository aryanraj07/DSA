package Queue;

public class _03_LinkedList
{
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        public static Node head=null;
        public static Node tail=null;
        public static boolean isEmpty()
        {
            return head==null &tail==null;
        }
        //add
        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode ;
            tail=newNode;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            //if single element
            if(head==tail)
            {
                head=tail=null;

            }
            else{
                head=head.next;

            }
                return front;


        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        //implementing queue using linked list
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }



    }
}
