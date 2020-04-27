package com.ksr;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_Iteration {
    public static void main(String[] args) {
        LinkedList<String> humanSpecies = new LinkedList<>();

        humanSpecies.add("Homo Sapiens");
        humanSpecies.add("Homo Neanderthalensis");
        humanSpecies.add("Homo Erectus");
        humanSpecies.add("Home Habilis");

        System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
        humanSpecies.forEach(species -> {
            System.out.println(species);
        });

        System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
        Iterator<String> iterator=humanSpecies.iterator();
        while (iterator.hasNext()) {
            String species = iterator.next();
            System.out.println(species);
        }

        System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
        iterator=humanSpecies.iterator();
        iterator.forEachRemaining(species-> {
            System.out.println(species);
        });

        System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
        Iterator<String> decendingIterator=humanSpecies.descendingIterator();
        while(decendingIterator.hasNext())
        {
            String species=decendingIterator.next();
            System.out.println(species);
        }

        System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
        // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
        // In this example, we start from the end of the list and traverse backwards

        ListIterator<String> listIterator=humanSpecies.listIterator(humanSpecies.size());
        while(listIterator.hasPrevious())
        {
            String species=listIterator.previous();
            System.out.println(species);
        }

        System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
        for (String species:humanSpecies)
        {
            System.out.println(species);
        }

    }
}
