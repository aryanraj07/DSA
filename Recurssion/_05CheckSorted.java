package Recurssion;

import java.security.spec.RSAOtherPrimeInfo;

public class _05CheckSorted {
    public static boolean  checkSorted(int []a,int i)
    {
        //base case
        if(i==a.length-1)
        {
            return true;
        }
        if(a[i]>a[i+1])
        {
            return false;
        }
        return  checkSorted(a,i+1);


    }

    public static void main(String[] args) {
        //Check if a given array is sorted or not
        int []arr={4,7,8,11,9,10};
        System.out.println(checkSorted(arr,0));


    }
}
