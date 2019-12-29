package com.ksr;

public class Exception1 {
    public static void main(String[] args) {
        try {
            int i = 2 / 0;
            System.out.println("Hello");        // after exception no statements will not executes
        } catch (Exception e) {
            System.out.println("Error");       // instead of thowing a erroe it print what we want in black text
            System.err.println("a");           // err change the color to red
        }
        finally
        {
            System.out.println("Hello");
        }

    }
}
