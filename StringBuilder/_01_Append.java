package StringBuilder;

public class _01_Append {
    public static void main(String[] args) {
        //append method of string builder adds the character to the last of the string
        StringBuilder s=new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            s.append(ch);
        }
        System.out.println(s);
        System.out.println(s.length());

    }

}
