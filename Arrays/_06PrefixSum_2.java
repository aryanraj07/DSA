package Arrays;

public class _06PrefixSum_2 {
    public static void prefixSum(int []arr)
    {
        //printing prefix sum array
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }

    }
    public static void printArr(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        //printing prefix sum using implace array
        int []arr={1,3,5,7,6};
        printArr(arr);
        prefixSum(arr);
        printArr(arr);


    }
}
