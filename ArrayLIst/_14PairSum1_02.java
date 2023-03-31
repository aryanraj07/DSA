package ArrayLIst;

import java.util.ArrayList;

public class _14PairSum1_02 {
    public static boolean pairSum1Two(ArrayList<Integer>list ,int target)
    {
        int n=list.size();
        int lp=0;
        int rp=n-1;
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target)
            {
                lp++;
            }
            else {
                rp--;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        //pair sum two pointer approach
        ArrayList<Integer> list=new ArrayList<>();
       list.add(3);
       list.add((4));
       list.add(5);
       list.add(6);
       list.add(10);
        System.out.println(list);
        System.out.println(pairSum1Two(list,15));

    }
}
