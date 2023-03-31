package LinkedList;

public class _09Search_Iterative {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public Node head;
    public Node tail;
    public static int size;
    public void addFirst(int data)
    {
        Node newNode= new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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


    public int searchIterative(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        _09Search_Iterative ll=new _09Search_Iterative();
        ll.addFirst(2);
        ll.addFirst((1));
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLat(8);
        ll.addLat(9);
        ll.print();

        System.out.println(ll.searchIterative(2));

    }
}
