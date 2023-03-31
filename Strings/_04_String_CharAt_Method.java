package Strings;

public class _04_String_CharAt_Method {
    public static void main(String[] args) {
        //using char At method function
        String name2=new String("Hello and Happy Holi");
        for(int i=0;i<name2.length();i++)
        {
            System.out.print(name2.charAt(i));
        }
        System.out.println();
        for(int i=1;i<name2.length();i++)
        {
            System.out.print(name2.charAt(i));

        }
        System.out.println();




    }
}
