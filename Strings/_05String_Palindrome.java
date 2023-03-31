package Strings;

import java.util.Scanner;

public class _05String_Palindrome {
    public static boolean palindromeChecker(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //check whether a string is palindrome or not
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(palindromeChecker(str));

    }
}
