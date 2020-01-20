package com.classes;
import java.util.ArrayList;

public class C24 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("by Simple for loop");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("By for each loop");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

