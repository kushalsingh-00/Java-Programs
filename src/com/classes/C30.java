package com.classes;
import java.util.Scanner;
public class C30 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");  // throw is used to throw error
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);
        int i=a.nextInt();
        checkAge(i);
    }
}
