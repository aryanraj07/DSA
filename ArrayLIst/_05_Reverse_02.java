package ArrayLIst;

import java.util.ArrayList;

public class _05_Reverse_02 {
    public static void reverseArray(ArrayList<Integer> list)
    {
        int i=0;
        int j=list.size()-1;
        while(i<j)
        {
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);
        // Original array is
        System.out.println("Original array is:");
        System.out.println(list);
        reverseArray(list);
        System.out.println("Reversed array is:");
        System.out.println(list);

    }
}
