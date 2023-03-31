package Arrays;

public class _08_Array_K_Times_Rotate {
    public static int[] kRotate(int []arr,int k)
    {
        int n=arr.length;
        int []newArr=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++)
        {
            newArr[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            newArr[j++]=arr[i];
        }

        return newArr;
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
        int []arr={1,2,3,4,5};
        printArr(arr);
        System.out.println("K Times rotated array is:");
        int []newArr=kRotate(arr,3);
        printArr(newArr);


    }
}
