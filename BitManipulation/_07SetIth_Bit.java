package BitManipulation;

public class _07SetIth_Bit {
    public static int setIthBit(int n,int i)
    {
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        //setting ith bit
        System.out.println(setIthBit(10,2));

    }
}
