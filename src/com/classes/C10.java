package com.classes;

class Outer1
{
    public void show()
    {
        System.out.println("Outer Class");
    }

   static class Inner
    {
        public void show()
        {
            System.out.println("Inner Class");
        }
    }
}

public class C10
{
    public static void main(String[] args)
    {
        Outer1 obj1=new Outer1();
        obj1.show();

        Outer1.Inner obj2=new Outer1.Inner();   //using static no need to of object for constructor
        obj2.show();
    }

}
