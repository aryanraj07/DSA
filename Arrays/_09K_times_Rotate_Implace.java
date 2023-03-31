package Arrays;

import java.util.Scanner;

public class _09K_times_Rotate_Implace
{
    public  static void reverse(int []arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void reverseKTimes(int []arr,int k)
    {
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);


    }
    public static void printArr(int []arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5,6};

        printArr(arr);
        System.out.println("Enter the value of k to rotate");
        int k=sc.nextInt();
        reverseKTimes(arr,k);
        printArr(arr);


    }
}
