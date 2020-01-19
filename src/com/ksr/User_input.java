package com.ksr;
import java.util.Scanner;
public class User_input {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);    // object of scanner class
        System.out.println("Enter Your name");
        String name=obj.nextLine();    // input from user
        System.out.println("Hi "+name+"!");
    }

}
