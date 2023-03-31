package Recurssion;

public class _06firstOccurence {
    public static int firstOccurrence(int []a,int key,int i)
    {
        if(i==a.length)
        {
            return -1;
        }
        //kaam
        if(a[i]==key)
        {
            return i;
        }

        return firstOccurrence(a,key,i+1);

    }

    public static void main(String[] args) {
        //first occurrence of  a key in the array
        int []arr={5,8,9,12,15};
        int key=9;
        System.out.println(firstOccurrence(arr,key,0));

    }
}
