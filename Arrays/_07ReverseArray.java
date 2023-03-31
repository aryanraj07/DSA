package Arrays;

public class _07ReverseArray {
    //reversing array using inplace array using two pointer concept
    public  static void reverse(int []arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
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
        //reversing array
        int []arr={1,2,3,4};
        System.out.println("Original array is: ");
        printArr(arr);
        reverse(arr);
        System.out.println("Reversed array is: ");
        printArr(arr);

    }
}
