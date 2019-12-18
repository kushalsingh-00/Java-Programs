package com.ksr;

class A1
{
    public static void A1()
    {
        int num[]=new int[4];
        System.out.println(num[1]);  //by default it have 0 stored
        System.out.println(num[4]);  // error which is array index out of bound exception
    }
}




public class Array {
    public static void main(String[] args)
    {
        A1 obj1=new A1();
        obj1.A1();
    }
}
