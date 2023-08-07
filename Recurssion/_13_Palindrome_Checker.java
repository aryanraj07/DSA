package Recurssion;

public class _13_Palindrome_Checker {
    public static String reverse(String s,int idx)
    {
        if(idx==s.length())
        {
            return "";
        }
        String smallString=reverse(s,idx+1);
        return smallString+s.charAt(idx);
    }
    public static boolean palindromeChecker(String s,int l,int r)
    {
        if(l>=r)
        {
            return true;
        }
        return s.charAt(l)==s.charAt(r) && palindromeChecker(s,l+1,r-1);
    }

    public static void main(String[] args) {
        String s="level";
        //Checking palindrome using reverse method
        String rev=reverse(s,0);
        if(s.equals(rev))
        {
            System.out.printf("%s is a palindrome\n",s);

        }
        else {
            System.out.printf("%s is not a palindrome\n",s);

        }
        //Checking palindrome using palindrome checker method
        System.out.println(palindromeChecker(s,0,s.length()-1));

    }
}
