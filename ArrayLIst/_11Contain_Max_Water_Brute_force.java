package ArrayLIst;

import java.util.ArrayList;

public class _11Contain_Max_Water_Brute_force {
    public static int maxWaterContainer(ArrayList<Integer> height)
    {
        //brute force
        int n=height.size();
        int maxWater=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(currWater,maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        //brute force approach
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
        System.out.println("Maximum container of water is: "+maxWaterContainer(list));
    }
}
