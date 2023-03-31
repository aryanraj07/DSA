package BitManipulation;

public class _05_OddEven {
    public static void checkEvenOdd(int n)
    {
        int bitMask=1;
        if((n&bitMask)==0)
        {
            System.out.println(n+" is an even number");
        }
        else
        {
            System.out.println(n+" is an odd number");
        }
    }

    public static void main(String[] args) {
        int n=3;
        checkEvenOdd(n);
    }
}
