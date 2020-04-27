package com.ksr;

import java.util.LinkedList;

public class Linked_List_Retrival {
    public static void main(String[] args) {
        LinkedList<Double> stock=new LinkedList<>();
        stock.add(45.00);
        stock.add(52.00);
        stock.add(86.00);
        stock.add(35.00);
        stock.add(57.00);

        // getting first element
        Double first_element=stock.getFirst();
        System.out.println(first_element);

        //getting last element
        Double last_element=stock.getLast();
        System.out.println(last_element);

        //getting random element according to index
        Double random;
        random=stock.get(3);
        System.out.println(random);

        random=stock.get(1);
        System.out.println(random);

    }
}
