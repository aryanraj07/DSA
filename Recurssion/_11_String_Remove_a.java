package Recurssion;

public class _11_String_Remove_a {
    public static String removeA(String str,int idx)
    {
        if(idx==str.length())
        {
            return  "";
        }
        String smallString=removeA(str,idx+1);
        char currChar=str.charAt(idx);
        if(currChar!='a')
        {
            return currChar +smallString;
        }
        else{
            return smallString;
        }
    }
    public static void main(String[] args) {
        String s="abdac";
        System.out.println(s);
        System.out.println(removeA(s,0));
    }
}
