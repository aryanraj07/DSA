package GreedyAlgorithm;
import java.util.*;
import java.util.Comparator;

public class _02_Unsorted_Maximum_Activity {
    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};
        int []end={2,4,6,7,9,9};
        //sorting
        int [][]activities=new int[start.length][3];
        for(int i=0;i<activities.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function shortform
        Arrays.sort(activities, Comparator.comparing(o ->o[2]));
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //select first
        maxAct+=1;
        ans.add(activities[0][0]);
        int lasttEnd=activities[0][2];
        for(int i=0;i<end.length;i++)
        {
            if (activities[i][1]>lasttEnd)
            {
                maxAct++;
                ans.add(activities[i][0]);
                lasttEnd=activities[i][2];

            }
        }
        System.out.println("Maximum activity" +maxAct );
                for(int i=0;i<ans.size();i++)
                {
                    System.out.print("A"+ans.get(i)+" ");
                }
        System.out.println();
    }
}
