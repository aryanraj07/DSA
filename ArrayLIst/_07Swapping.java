package ArrayLIst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _07Swapping {
    public static void swqapp(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);


    }
    public static void main(String[] args) {
        //swapping two value in ArrayList
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(3);
        list.add(45);
        list.add(7);
        list.add(9);
        list.add(27);
        System.out.println("Original list is:");
        System.out.println(list);
        swqapp(list,2,3);
        System.out.println("Swapped list is:");
        System.out.println(list);

    }
}
