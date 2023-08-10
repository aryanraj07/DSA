package Hashing;

import java.util.TreeMap;

public class _04_Tree_HashMap {
    public static void main(String[] args) {
        //follows alphabetical order(String) or sorting order
        TreeMap<String ,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",50);
        System.out.println(tm);

    }
}
