package LinkedList_Part2;

public class _01_Detect_Cycle {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static boolean is_Cycle()
    {
        Node slow =head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        //detect a cycle in a linked List
        _01_Detect_Cycle ll=new _01_Detect_Cycle();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;

        System.out.println(is_Cycle());


    }
}
