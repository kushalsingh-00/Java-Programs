package com.classes;

public class C15 {
    static void myStaticMethod()
    {
        System.out.println("Static methods can be called without creating a object");
    }

    public void myPublicMethod()
    {
        System.out.println("public methods must be called by creating a objectr");
    }
    public static void main(String[] arg)
    {
        myStaticMethod();   //called without object
        C15 obj=new C15();
        obj.myPublicMethod();    //called by object
    }
}
