package Arrays;

public class _12_Second_Max {
    public static int findMax(int []a)
    {
        int n=a.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static int findSecondMax(int []a)
    {
        int n=a.length;
        int max=findMax(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            {
                a[i]=Integer.MIN_VALUE;
            }

        }
        int secondMax=findMax(a);
        return secondMax;

    }

    public static void main(String[] args) {
        //finding second max
        int []a={3,5,8,1,17,4,};
        System.out.println(findSecondMax(a));
    }
}
