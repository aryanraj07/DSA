package Sorting;

public class Selections9rt {
    public static void selectionSort(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)

            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    public static void printArr(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //selection sorting
        int []arr={7,8,5,3,1};
        selectionSort(arr);
        printArr(arr);

    }
}
