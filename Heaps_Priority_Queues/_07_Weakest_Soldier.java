package Heaps_Priority_Queues;
import java.util.*;
public class _07_Weakest_Soldier {
    public static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        public Row(int soldier,int idx)
        {
            this.soldier=soldier;
            this.idx=idx;
        }
        @Override
        public  int compareTo(Row r2)

        {
            if(this.soldier==r2.soldier)
            {
                return this.idx-r2.idx;
            }
            else {
                return this.soldier-r2.soldier;
            }
        }
    }
    public static void main(String[] args) {
        int [][]array={ {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
        };
        int k=2;
        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<array.length;i++)
        {
            int count=0;
            for(int j=0;j<array[0].length;j++)
            {
                count+=array[i][j]==1?1:0;
            }
            pq.add( new Row(count,i));

        }
        for(int i=0;i<k;i++)
        {
            System.out.println("R"+pq.remove().idx);
        }


    }
}
