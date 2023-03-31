package LinkedList;

public class _13_Palindrome_check {
    public static  class Node{
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
    public   void addFirst(int data)
    {
        //crate node
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
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;  //as slow is the mid of the linkedList

    }
    public  boolean palindromeChecker()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        Node midNode=findMid(head);
        //now step2
//        reversing the second half of the  linkedList
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;  //head of right node
        Node left=head;
        //Now step 3
//         check left part equal to right part
        while(right!=null)
        {
            if(left.data!= right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }





    public static void main(String[] args) {
        //check whether a linked list is a palindrome
        _13_Palindrome_check ll=new _13_Palindrome_check();
        ll.addLat(1);
        ll.addLat(2);
        ll.addLat(2);
        ll.addLat(1);
        ll.print();
        System.out.println("Checking whether a linked list is palindrome");
        System.out.println(ll.palindromeChecker());





    }
}
