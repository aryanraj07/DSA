package ArrayLIst;

import java.util.ArrayList;

public class _13PairSum1_01 {
    public static boolean pairSum1(ArrayList<Integer> list,int target)
    {
        int n=list.size();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++)
            {
                if(list.get(i)+list.get((j))==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println(pairSum1(list,13));
    }
}
