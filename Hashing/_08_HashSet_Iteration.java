package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class _08_HashSet_Iteration {
    public static void main(String[] args) {
        HashSet<String>cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        Iterator it=cities.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //this can also be done using for each loop
        for(String city:cities)
        {
            System.out.println(city);
        }
    }
}
