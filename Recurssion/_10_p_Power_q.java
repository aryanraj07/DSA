package Recurssion;

public class _10_p_Power_q {
    public static int power(int p,int q)
    {
        if(q==0)    return  1;
        return power(p,q-1)*p;
    }

    public static void main(String[] args) {
        int p=5,q=3;
        System.out.println(power(p,q));
    }
}
