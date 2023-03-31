package _2d_Array;
import java.util.Scanner;
public class _03_Matrix_Multiplicataion {
    public static void multiplyMatrix(int [][]a,int r1,int c1,int [][]b,int r2,int c2)
    {
        if(c1!=r2)
        {
            System.out.println("Invalid matrix...cannot perform multiplication");
            return ;
        }
        int [][]mul=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=1;j<c2;j++)
            {
                for(int k=1;k<c1;k++)  //k can run either c1 times or r2 times

                {
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplilcation of two matrix is:");
        printMatrix(mul);

    }
    public static void printMatrix(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //performing matrix multiplication
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of the first matrix");
        int r1=sc.nextInt();
        System.out.println("Enter number of columns of the first matrix");
        int c1=sc.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of second matrix:");
        int r2=sc.nextInt();
        System.out.println("Enter number of columns of the second matrix");
        int c2=sc.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("First matrix is:");
        printMatrix(a);
        System.out.println("Second Matrix is:");
        printMatrix(b);
        multiplyMatrix(a,r1,c1,b,r2,c2);


    }
}
