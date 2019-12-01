package com.ksr;

public class Age {
     static void checking(int a) {
        if(a<18)
        {
            System.out.println("Access Denied!");
        }
        else
        {
            System.out.println("Access Granted!");
        }
    }

    public static void main(String[] args) {
         checking(20);
    }
}
