package Arrays;

public class _10SuffixSum {
    public static void suffixSum(int []arr)
    {
        int n=arr.length;
        for(int i=n-2;i>=0;i--)
        {
            arr[i]=arr[i]+arr[i+1];
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
        int []arr={1,2,3,4};
        printArr(arr);
        //suffix sum will be  =[10,9,7,4]
        suffixSum(arr);
        System.out.println("Suffix sum array is:");
        printArr(arr);


    }
}
