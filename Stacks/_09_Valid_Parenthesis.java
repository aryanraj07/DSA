package Stacks;
import java.util.Stack;

public class _09_Valid_Parenthesis {
public  static boolean parenthesisChecker(String str)
{
    Stack<Character> s=new Stack<>();
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        //opening case
        if(ch=='(' || ch=='[' || ch=='{')
        {
            s.push(ch);
        }
        else{
            //closing case
            if(s.isEmpty())  //"))))}}"  here there is no closing bracket
            {
                return false;
            }
            else {
                if((s.peek()=='['  && ch==']') || (s.peek()=='{' && ch=='}') || (s.peek()=='(' && ch==')'))
                {
                    s.pop();

                }
                else {
                    return false;
                }
            }



        }
    }
        if(s.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
}
    public static void main(String[] args) {
//     String str="({}[])";
        String str="({}[])]";
        System.out.println(parenthesisChecker(str));
    }
}
