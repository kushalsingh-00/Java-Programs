package com.ksr;

import java.util.LinkedList;

public class Linked_List_Removal {
    public static void main(String[] args) {
        LinkedList<String> programmingLanguages = new LinkedList<>();

        programmingLanguages.add("Assembly");
        programmingLanguages.add("Fortran");
        programmingLanguages.add("Pascal");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("Kotlin");

        System.out.println("Initial LinkedList = " + programmingLanguages);

        String element=programmingLanguages.removeFirst();  //removing first element
        System.out.println("Removed the first element " + element + " => " + programmingLanguages);

        element=programmingLanguages.removeLast();  //removing last
        System.out.println("Removed the last element " + element + " => " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("C#");      //condition
        if(isRemoved) {
            System.out.println("Removed C# => " + programmingLanguages);
        }

        //with condition
        programmingLanguages.removeIf(programmingLanguage -> programmingLanguage.startsWith("C"));
        System.out.println("Removed elements starting with C => " + programmingLanguages);

        //for removal of all elements
        programmingLanguages.clear();
        System.out.println("Cleared the LinkedList => " + programmingLanguages);

    }
}
