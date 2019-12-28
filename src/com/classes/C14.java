package com.classes;

public class C14 {
    final int X=10;
    final double PI=3.14;
    public static void main(String[] args)
    {
        C14 obj=new C14();
        double a=obj.PI;   // not able to modify it
        System.out.println(obj.X);
    }
}
