package com.classes;

import java.util.Scanner;

public class C23 {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=obj.nextLine();
        System.out.println("Enter Your Age");
        int age=obj.nextInt();
        System.out.println("Enter Your alary");
        double salary=obj.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
