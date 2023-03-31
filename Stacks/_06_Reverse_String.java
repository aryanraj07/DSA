package Stacks;
import java.util.Stack;
public class _06_Reverse_String {
    public static void pushAtBottom(Stack<Integer>s,int data)
    {
        if(s.isEmpty())

        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void print(Stack<Integer>s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        //reverse the stack using recursion  time c.c=O(n) ,space.c=O(1)
     Stack<Integer> s=new Stack<>();
     s.push(1);
     s.push(2);
     s.push(3);
     reverseStack(s);
        print(s);


    }
}
