package com.classes;

public class C2 {
    final int y=4;   // cannot change the value of y or not able to override it
    public static void main(String[] args) {
        C1 myObj2 = new C1();
        C2 myObj1=new C2();
        myObj2.x=20;
        System.out .println(myObj1.y);
        System.out.println(myObj2.x+5);
    }
}
