package BackTracking;

public class _01_Arrays {
    public static void changeArr(int []arr,int i,int val)
    {
        if(i==arr.length)
        {
            printArr(arr);
            return;
        }
        //recursion step
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;  //backtracking step

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

    //adding values in an empty array and then subtracting 2 from it
        int []arr=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
