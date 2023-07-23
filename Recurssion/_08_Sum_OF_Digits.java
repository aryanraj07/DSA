package Recurssion;

public class _08_Sum_OF_Digits {
    public static int sumOFDigits(int n)
    {
        //base case
        if(n>=0 && n<=9)
        {
            return n;
        }
        //recursive work
//        int smallAns=sumOFDigits(n/10);
//        return smallAns+n%10;
        return sumOFDigits(n/10)+n%10;
    }

    public static void main(String[] args) {
        int digit=5234;
        System.out.println(sumOFDigits(digit));
    }
}
