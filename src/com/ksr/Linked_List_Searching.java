package com.ksr;

import java.util.LinkedList;

public class Linked_List_Searching {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();

        employees.add("John");
        employees.add("David");
        employees.add("Lara");
        employees.add("Chris");
        employees.add("Steve");
        employees.add("David");

        //checking if it contains the element or not
        System.out.println("Does it contain \"Lara\"? : " + employees.contains("Lara"));

        // Find the index of the first occurrence of an element in the LinkedList
        System.out.println("indexOf \"Steve\" : " + employees.indexOf("Steve"));
        System.out.println("indexOf \"Mark\" : " + employees.indexOf("Mark"));  // if element not prent it shows -1

        // Find the index of the last occurrence of an element in the LinkedList
        System.out.println("lastIndexOf \"David\" : " + employees.lastIndexOf("David"));
        System.out.println("lastIndexOf \"Bob\" : " + employees.lastIndexOf("Bob"));

    }
}
