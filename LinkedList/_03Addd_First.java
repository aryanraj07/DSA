package LinkedList;

public class _03Addd_First {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        public void addFirst(int data) {
            //first step is to create the nuew node
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }



    }
    public static void main(String[] args) {
        //adding an element at the starting of the linked List

    }
}
