package Arrays;

public class _11_Last_Repeating {
    public static int lastRepeating(int []a)
    {
        int ans=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    ans=a[i];
                }
            }
        }
        return ans;
    }
    public static int notRepeating(int []a)
    {
        int ans=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=Integer.MIN_VALUE;
                    a[j]=Integer.MIN_VALUE;
                }
            }

        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>Integer.MIN_VALUE)
            {
                return a[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        //find the last repeating number in the array
        int a[]={1,2,3,1,2,3,5,4,5};
        System.out.println(lastRepeating(a));
        System.out.println(notRepeating(a));
    }
}
