package Strings;
import java.util.*;
public class _02Input_Output_String {
    public static void main(String[] args) {
        char []arr={'a','b','c','d'};
        String str="abcd";
        Scanner sc=new Scanner(System.in);
        System.out.println("Here we can enter more than one word");
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println("Here we can enter only a single word");
        String name2;
        name2=sc.next();
        System.out.println(name2);

    }
}
