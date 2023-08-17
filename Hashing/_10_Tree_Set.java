package Hashing;

import java.util.TreeSet;

public class _10_Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> cities=new TreeSet<>();
        //sorted in ascending order and null value is not allowed so time complexity goes to O(logn)
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
    }
}
