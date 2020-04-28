package com.ksr;

import java.util.HashMap;
import java.util.Map;

public class HashMap_adding {
    public static void main(String[] args) {
        Map<String, Integer> number = new HashMap<>();                //creating hashmap
        HashMap<String,Integer> hashMap=new HashMap<>();

        //entering values
        number.put("One",1);
        hashMap.put("One",1);
        number.put("Two",2);
        hashMap.put("Two",2);
        number.put("Three",3);
        hashMap.put("Three",3);

        number.putIfAbsent("Four",4);     //it put value if not present
        number.putIfAbsent("Five",5);

        System.out.println(number);

        System.out.println(hashMap);
    }
}
