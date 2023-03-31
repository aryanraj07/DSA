package Strings;

public class _07_String_Comparision {
    public static void main(String[] args) {
        //checking whether two strings are equal or not
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1==s2)
        {
            System.out.println("String 1 and String2 are equal");
        }
        else
        {
            System.out.println("NO String 1 and String2 are not equal");
        }
        if(s2==s3)
        {
            System.out.println("String 2 and String3 are equal");
        }
        //as this (==)check the value of s2 and s3 at object level so String will not be eaul
        else
        {
            System.out.println("NO String 1 and String3 are not equal");
        }
        //so we use .equals function
        if(s2.equals(s3))
        {
            System.out.println("s2 and s3 are equal");
        }
        else
        {
            System.out.println("No,s2 and s3 are not equal");
        }




    }
}
