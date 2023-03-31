package _2d_Array;

import java.util.Scanner;

public class _04_PascalsTriangle {
    public static int[][] pascalsTriangle(int n)
    {
        int [][]ans=new int[n][];
        for(int i=0;i<n;i++)
        {
            //ith row has i+1 columns
            ans[i]=new int[i+1];
            //1st and last element of each row is 1
                 ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++ )
            {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void printMatrix(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ///pascals triangle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int [][]ans=pascalsTriangle(n);
        printMatrix(ans);

    }
}
