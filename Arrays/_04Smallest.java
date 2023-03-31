package Arrays;

import java.util.Scanner;

public class _04Smallest {
    public static int smallest(int []arr)
    {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }

    return small;
    }

    public static void main(String[] args) {
        //finding smallest
        Scanner sc=new Scanner(System.in);

        int []arr={4,6,7,8,9,1};
        System.out.println(smallest(arr));
    }
}
