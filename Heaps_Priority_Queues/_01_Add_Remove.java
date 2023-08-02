package Heaps_Priority_Queues;
import java.util.Comparator;
import java.util.Objects;
import  java.util.PriorityQueue;
public class _01_Add_Remove {
    public static void main(String[] args) {
        //descending order
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(1);
        pq.add(7);
        pq.add(4);
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
