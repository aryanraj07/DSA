package ArrayLIst;

import java.util.ArrayList;

public class _03Size {
    public static void main(String[] args) {
        System.out.println("USing size function");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);
        System.out.println(list.size());
        //Printing the arrayList elements
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
