package Hashing;

import java.util.LinkedHashMap;

public class _03_LInked_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        //order of insertion is foolowed while inserting and printing
        lhm.put("India",100);
        lhm.put("Us",50);
        lhm.put("China",150);
        System.out.println(lhm);

    }
}
