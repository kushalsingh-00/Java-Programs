package com.classes;

interface Functional
{
    void show();
}

public class C16 {
    public static void main(String[] args)
    {
        Functional obj=() -> System.out.println("i am");  //lambda Expression
        obj.show();
    }
}
