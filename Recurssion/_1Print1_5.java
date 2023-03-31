package Recurssion;

public class _1Print1_5 {
    public static void printNum(int n)
    {
        if(n==5)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNum(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}
