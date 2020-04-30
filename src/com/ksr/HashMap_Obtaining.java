package com.ksr;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Obtaining {
    public static void main(String[] args) {
        Map<String,String> countryCode=new HashMap<>();
        countryCode.put("India", "IN");
        countryCode.put("United States Of America","US");
        countryCode.put("Russia","RU");
        countryCode.put("Japan","JP");
        countryCode.put("China","CN");

        //HashMap Entry Set
        Set<Map.Entry<String,String >> countryIso=countryCode.entrySet();
        System.out.println(countryIso);

        //KeySet
        Set<String > countries=countryCode.keySet();
        System.out.println(countries);

        //values
        Collection<String> isoCode=countryCode.values();
        System.out.println(isoCode);
    }
}
