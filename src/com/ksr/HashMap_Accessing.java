package com.ksr;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Accessing {
    public static void main(String[] args) {
        Map<String,String> userCity=new HashMap<>();

        //checking if the hashmap is empty or not
        System.out.println("is userCityMapping empty? : " + userCity.isEmpty());


        userCity.put("John", "New York");
        userCity.put("Rajeev", "Bengaluru");
        userCity.put("Steve", "London");

        System.out.println(userCity);

        //finding size
        System.out.println("Size"+userCity.size());

        // checking if the string exist or not

        String user="Steve";

        if(userCity.containsKey(user))
        {
            System.out.println(userCity.get(user));
        }
        else
            System.out.println("not found");

        //checking the exitence of user
        if(userCity.containsValue("New work"))
            System.out.println("There is a user in the userCityMapping who lives in New York");
        else
            System.out.println("no user present with this name");

        // Modify the value assigned to an existing key
        userCity.put(user, "California");
        System.out.println(user + " moved to a new city " + userCity.get(user) + ", New userCityMapping : " + userCity);

        // The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println("Lisa's city : " + userCity.get("Lisa"));

    }
}
