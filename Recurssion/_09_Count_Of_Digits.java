package Recurssion;

public class _09_Count_Of_Digits {
    public static int countOfDigits(int n)
    {
        if(n>=0 &&n<=10)
        {
            return 1;
        }
        return 1+countOfDigits(n/10);
    }
    public static void main(String[] args) {
        int n=5234;
        System.out.println(countOfDigits(n));

    }
}
