package Recurssion;

public class _3Sum_n {

    public static void  findSum(int n,int sum)
    {


        if(n==0)
        {
            System.out.println(sum);
            return ;
        }

         sum+=n;
        findSum(n-1,sum);



    }
    public static void printSum2(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum2(i+1,n,sum);

    }


    public static void main(String[] args) {
        //printing sum of n numbers
        int n=10;
        findSum(n,0);
        printSum2(1,n,0);
    }
}
