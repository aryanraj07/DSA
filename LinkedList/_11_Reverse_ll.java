package LinkedList;

public class _11_Reverse_ll {
    public static class Node{
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
    public static int size;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void add(int idx,int data)
    {

        if(head==null)
        {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }
    public void addLat(int data)
    {
        Node newNode=new Node(data);
        size++;
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
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;  //as current has become null
    }
    public static void main(String[] args) {
        //reverse a linked list
        _11_Reverse_ll ll=new _11_Reverse_ll();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLat(4);
        ll.addLat(5);
        ll.add(2,3);
        System.out.println("The original linked list is:");
        ll.print();
        ll.reverse();
        System.out.println("The reversed linked list is:");
        ll.print();

    }

}
