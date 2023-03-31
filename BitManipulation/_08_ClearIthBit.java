package BitManipulation;

public class _08_ClearIthBit {
    public static int clearBit(int n,int i)
    {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        //clear ith bit  ie converting the ith bit to 0
        System.out.println(clearBit(10,3));

    }
}
