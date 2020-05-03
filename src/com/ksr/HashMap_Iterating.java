package com.ksr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Iterating {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);

        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        employeeSalary.forEach((employe,salary)->{
                System.out.println(employe+"==>"+salary);
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String,Double>> employeeSalaryEntry=employeeSalary.entrySet();
        Iterator<Map.Entry<String,Double>> employeeSalaryIterator=employeeSalaryEntry.iterator();
        while(employeeSalaryIterator.hasNext())
        {
            Map.Entry<String,Double> entry=employeeSalaryIterator.next();
            System.out.println(entry);
        }

        System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        employeeSalary.entrySet().forEach(entry1->{
            System.out.println(entry1.getKey()+"==>"+entry1.getValue());
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");

        for(Map.Entry<String,Double> entry: employeeSalary.entrySet())
        {
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        employeeSalary.keySet().forEach(employee->{
            System.out.println(employee+"==>"+employeeSalary.get(employee));
        });
    }
}
