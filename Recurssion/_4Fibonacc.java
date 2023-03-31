package Recurssion;

public class _4Fibonacc {
    public static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm1;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }

}
