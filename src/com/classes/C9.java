package com.classes;

class Outer
{
    public void show()
    {
        System.out.println("Outer Class");
    }

    class Inner
    {
        public void show()
        {
            System.out.println("Inner Class");
        }
    }
}

public class C9
{
    public static void main(String[] args)
    {
        Outer obj1=new Outer();
        obj1.show();

        Outer.Inner obj2=obj1.new Inner();
        obj2.show();
    }

}
