package com.classes;

public class C22 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args)
    {
        Level myVar=Level.HIGH;
        switch (myVar)               // using in switch case
        {
            case LOW: System.out.println("Low Level");
            break;
            case MEDIUM: System.out.println("Low Level");
            break;
            case HIGH: System.out.println("Low Level");
            break;
        }

        for(Level myVar1:Level.values())
        {
            System.out.println(myVar1);  //using in for loop
        }
    }
}
