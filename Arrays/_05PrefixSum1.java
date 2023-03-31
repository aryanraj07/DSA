package Arrays;

public class _05PrefixSum1 {
    public static int []prefixSum(int []arr)
    {
        int []pref=new int[arr.length];
         pref[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pref[i]=arr[i]+pref[i-1];
        }
        return pref;
    }
    public static void printArr(int []arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //printing prefix sum array
        int []arr={1,4,5,7,9};
        printArr(arr);
        int []prefix=prefixSum(arr);
        printArr(prefix);

    }
}
