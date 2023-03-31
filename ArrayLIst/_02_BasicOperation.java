package ArrayLIst;
import java.util.*;
public class _02_BasicOperation {
    public static void main(String[] args) {
        //adding elements
        ArrayList<Integer> list1=new ArrayList<>();
        //adding elements
        list1.add(2);
        list1.add((3));
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1);
        //get elements
        System.out.println("Using get method in arrayList elements ");
        int element=list1.get(1);
        System.out.println(element);
        //delete element
        System.out.println("Deleting element in ArrayList");
        list1.remove(2);
        //time complexity of delete operation in arrayList is linear time
        //set element at index
        System.out.println("Setting element in ArrayList");
        list1.set(2,14);  //list.set(index,value)
        //contains elements
        System.out.println("Using contain elements in ArrayList");
        System.out.println(list1.contains(4));
        System.out.println(list1.contains(14));
        //one more adding function
        System.out.println("We can also use adding operation in ArrayList using add function");
        list1.add(1,20);
        System.out.println(list1);










    }
}
