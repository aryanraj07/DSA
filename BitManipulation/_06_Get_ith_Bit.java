package BitManipulation;

public class _06_Get_ith_Bit {
    public static int getIthBit(int n,int i)
    {
        int bitMask=1<<i;
        if((n&bitMask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        //getting ith bit of a number

        System.out.println(getIthBit(15,3));

    }
}
