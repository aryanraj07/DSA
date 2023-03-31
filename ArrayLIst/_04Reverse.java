package ArrayLIst;

import java.util.ArrayList;

public class _04Reverse {
    public static void main(String[] args) {
        //printing reverse of the elements
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);
        // Original array is
        System.out.println(list);
        System.out.println("Reversed array is:");
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");;
        }
        System.out.println();
    }
}
