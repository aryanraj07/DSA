package Recurssion;

public class _07_Last_Ocuurence {
    public static int lastOccurrence(int []a,int key,int i)
    {
        if(i==a.length)
        {
            return -1;
        }
        int isFound=lastOccurrence(a,key,i+1);
        if(isFound==-1 && a[i]==key)
        {
            return i;
        }
        return isFound;



    }


    public static void main(String[] args) {
        int []arr={3,7,8,9,6,9,12};
        System.out.println(lastOccurrence(arr,9,0));
    }
}
