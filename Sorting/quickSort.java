package Sorting;

public class quickSort {
    public static int partition(int []arr,int low,int high)


    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot) {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }

        //creating space for pivot place
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;  //pivot index


    }
    public static void quickSort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int pdx=partition(arr,low,high);
            quickSort(arr,low,pdx-1);
            quickSort(arr,pdx+1,high);

        }
    }
    public static void printArr(int []arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //Quick sorting
        int []arr={7,8,5,3,2,1};
        quickSort(arr,0, arr.length-1);
        printArr(arr);

    }
}
