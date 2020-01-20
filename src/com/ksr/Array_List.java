package com.ksr;
import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args)
    {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");   // add() is used to add values
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());     // size() is used for determining size of array

        System.out.println(cars.get(0));   // get() is used for accessing value on particular places

        cars.set(0,"Opel");     // set() is used for change values on particular place
        System.out.println(cars);

        cars.remove(0);     // remove for removing
        System.out.println(cars);

        cars.clear();         // clear() is used for removing all items
        System.out.println(cars);

    }
}
