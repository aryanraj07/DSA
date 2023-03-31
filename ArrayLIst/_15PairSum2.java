package ArrayLIst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _15PairSum2 {
    public static boolean pairSum(ArrayList<Integer>list ,int target)
    {
        int n=list.size();
        int bp=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=bp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else
            {
                rp=(n+rp-1)%n;
            }

        }
        return false;

    }
    public static void main(String[] args) {
        //finding a pair for a given sum in a sorted and rotated array
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list,16));

    }
}
