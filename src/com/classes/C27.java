package com.classes;
import java.util.HashMap;
public class C27 {
    public static void main(String[] args)
    {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // for accessing only keys use keySet() method

        for(String i:capitalCities.keySet()){
            System.out.println(i);
        }
        System.out.println();

        //for accessing only values
        for(String i:capitalCities.values()){
            System.out.println(i);
        }
    System.out.println();
        // for both
        for(String i:capitalCities.keySet()){
            System.out.println("key:"+i+"values:"+capitalCities.get(i));
        }
    }
}

