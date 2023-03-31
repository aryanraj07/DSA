package StringBuilder;

public class _02_Fisrstchar_Upper_Case {
    public static String toUpperCase(String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' && i<str.length()-1)
            {
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //conver the first letter of each word in  the sentence to uppercase
        String str="hello i am aryan ";
        System.out.println(str);
        System.out.println("After perfoming uppercase method");
        System.out.println(toUpperCase(str));
    }
}
