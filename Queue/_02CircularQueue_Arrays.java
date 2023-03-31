package Queue;

public class _02CircularQueue_Arrays {
    public static class queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        public queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;

        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        //adding elements
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            //(last element)
            int result=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else {

                front=(front+1)%size;
            }
            return result;
        }
        //peek operation returns the element present on the front
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }


    }
    public static void main(String[] args) {
        //implementing circular queue using arrays
        queue q=new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }



    }
}
