package Arrays;

import java.util.Scanner;

public class LargestNUmber {
    public static int largest(int []a)
    {
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }

        }
        return largest;

    }

    public static void main(String[] args) {
        //largest
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();

        int []a=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(largest(a));



    }
}
