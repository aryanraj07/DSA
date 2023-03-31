package Stacks;
import java.util.Stack;
public class _04_Push_Bottom {
    public static void pushAtBottom(Stack<Integer>s,int data)
    {
        //base case
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }



    public static void main(String[] args) {
        //push the data at the bottom of the stack
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
