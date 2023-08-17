package Hashing;

import java.util.LinkedHashSet;

public class _09_LInked_HashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        //orderd is followed  and follows doubly linked list
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
    }
}
