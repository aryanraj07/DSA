package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _06_Indian_Coins {
    public static void main(String[] args) {
        Integer []coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfOIns=0;
        int amount=590;
        ArrayList<Integer>ans =new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<=amount)
            {
                while(coins[i]<=amount)
                {
                    countOfOIns++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }

            }
        }
        System.out.println("Total Number of minimum coins used:"+countOfOIns);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}

