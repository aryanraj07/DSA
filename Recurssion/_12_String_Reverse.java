package Recurssion;

import org.w3c.dom.ls.LSOutput;

public class _12_String_Reverse {
    public static String reverse(String s,int idx)
    {
        if(idx==s.length())
        {
            return "";
        }
        String smallString=reverse(s,idx+1);
        return smallString+s.charAt(idx);
    }
    public static String reverse2(String s)
    {
        if(s.length()==0)
        {
            return "";
        }
        String smallAns=reverse2(s.substring(1));
        return smallAns+s.charAt(0);
    }


    public static void main(String[] args) {

    String s="abcde";
        System.out.printf("%s is the original string\n",s);
        System.out.println("Reversed string is "+reverse(s,0));
        System.out.println("Reversed string is "+reverse2(s));
    }



}
