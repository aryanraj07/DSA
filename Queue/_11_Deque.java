package Queue;
import java.util.*;

public class _11_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First element= "+deque.getFirst());
        System.out.println("Last element= "+deque.getLast());
    }
}
