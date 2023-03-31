package ArrayLIst;

import java.util.ArrayList;

public class _06_maximum {
    public static int maximum(ArrayList<Integer> list)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
//            if(list.get(i)>max)
//            {
//                max=list.get(i);
//            }

            //or
            max=Math.max(max,list.get(i));

        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(3);
        list.add(45);
        list.add(7);
        list.add(9);
        list.add(27);
        System.out.println(list);
        System.out.println("Maximum value is "+maximum(list));


    }
}
