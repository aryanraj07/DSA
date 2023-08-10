package Hashing;

import java.util.HashMap;

public class _01_HashMap_Operations {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        System.out.println(hm);
        int popu=hm.get("India");
        System.out.println(popu);
        System.out.println(hm.get("Indo"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indo"));
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("Indo"));
        System.out.println(hm.size());



    }
}
