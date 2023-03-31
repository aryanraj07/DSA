package ArrayLIst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _08_Sorting {
    public static void main(String[] args) {
        //sorting an arraylist
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(3);
        list.add(45);
        list.add(7);
        list.add(9);
        list.add(27);
        System.out.println("Original list is:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted list is:");
        System.out.println(list);
        //sorting in descending order is
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);





    }
}
