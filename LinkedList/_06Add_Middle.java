package LinkedList;

public class _06Add_Middle {
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
    public void add(int idx,int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            addFirst(data);
            return;
        }
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
        //adding the new node in the middle
        _06Add_Middle ll=new _06Add_Middle();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLat(4);
        ll.addLat(5);
        ll.print();
        ll.add(2,3);
        ll.print();

    }
}