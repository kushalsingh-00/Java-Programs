package com.ksr;

public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double num; // Automatic casting: int to double
        num = myInt;

        System.out.println(myInt);      // Outputs 9
        System.out.println(num);   // Outputs 9.0


        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9
    }
}
