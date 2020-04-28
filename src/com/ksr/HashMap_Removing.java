package com.ksr;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Removing {
    public static void main(String[] args) {
        Map<String,String> husbandWife=new HashMap<>();
        husbandWife.put("Jack","Marie");
        husbandWife.put("Chris","Lisa");
        husbandWife.put("Steve","Jennifer");

        //initial values
        System.out.println("Husband-Wife: "+husbandWife);

        //Removing
        // Ex - Unfortunately, Chris got divorced. Let's remove him from the mapping
        String husband="Steve";
        String wife=husbandWife.remove(husband);
        System.out.println("Couple ("+husband+" ==> "+wife+") got divorced");
        System.out.println("New Mapping"+husbandWife);

        // Remove a key from the HashMap only if it is mapped to the given value
        // Ex - Divorce "Jack" only if He is married to "Linda"
        boolean isRemoved = husbandWife.remove("Jack", "Linda");
        System.out.println("Did Jack get removed from the mapping? : " + isRemoved);

        // remove() returns null if the mapping was not found for the supplied key
        wife = husbandWife.remove("David");
        if(wife == null) {
            System.out.println("Looks like David is not married to anyone");
        } else {
            System.out.println("Removed David and his wife from the mapping");
        }

    }
}