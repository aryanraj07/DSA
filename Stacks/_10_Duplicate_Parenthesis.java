package Stacks;

import java.util.Stack;

public class _10_Duplicate_Parenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //closing case
            if (ch == ')') {
                int count = 0;
//                while(s.isEmpty() && s.peek()!='(')  //this while loop can be replaced by
//                    while ((s.peek()!='('))
//                {
//                    s.pop();
//                    count++;
//                }
//                    if(count<1)
//                    {
//                        return true;
//                    }
//                    else {
//                        s.pop();
//                    }
//
//            }
                //this can be further modified as
                while (s.pop() != '(') {

                    count++;
                }
                if (count < 1) {
                    return true;
                }
                } else {
                    //opening case
                    s.push(ch);
                }
            }
            return false;
        }
    public static void main(String[] args) {
        //if duplicate parenthesis exist then return true
        String str="((aa+b)+(c+d))";
        String str2="((a+b))";
        System.out.println(str+" is :"+isDuplicate(str));
        System.out.println(str2+" is :"+isDuplicate(str2));

    }

}
