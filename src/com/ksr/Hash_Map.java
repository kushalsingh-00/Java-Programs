package com.ksr;
import java.util.HashMap;
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>(); // creating HashMap object
        // add key and values(country,capital city)
        capitalCities.put("India", "Delhi");   //putting values/ adding
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));  // gor getting particular values

        capitalCities.remove("England");
        System.out.println(capitalCities);

        System.out.println(capitalCities.size());

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
