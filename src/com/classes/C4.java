package com.classes;

public class C4 {
    static void myStaticMethod() {
        System.out.println("Static method can be called without creating an object");
    }

    public void myPublicMethod() {
        System.out.println("Public method can be called by creating an object");
    }

    public static void main(String args[]) {
        myStaticMethod();
        C4 obj=new C4();
        obj.myPublicMethod();
    }
}
