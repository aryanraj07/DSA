package ArrayLIst;

import java.util.ArrayList;

public class _12ContainsMostWater_2Pointer_Approach {
    public static int maxWaterContainer(ArrayList<Integer> height)
    {
        int n=height.size();
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp)
        {
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);
            //pointer update
            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        //two pointer approach
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
        System.out.println(maxWaterContainer(list));

    }
}
