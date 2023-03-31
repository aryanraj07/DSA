package Strings;

public class _String_Larget_Compare_To {
    public static String largest(String[]fruits)
    {
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++)
        {
            if(largest.compareTo(fruits[i])<0)
            {
                largest=fruits[i];
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        //printing the largest string
        String []fruits={"apple","banana","mango","carrot"};
        System.out.println("largest string is:"+largest(fruits));
    }
}
