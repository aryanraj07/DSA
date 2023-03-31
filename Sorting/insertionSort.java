package Sorting;

public class insertionSort {
    public static void insertionSort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {

            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;

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
        //insertion sort
        int []ar={7,8,5,4,6,1};
        insertionSort(ar);
        printArr(ar);
    }
}
