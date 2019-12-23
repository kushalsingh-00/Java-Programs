package com.ksr;
class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class Anonymous_class
{
    public static void main(String[] args)
    {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("in am the best");
            }
        };
        obj.show();
    }
}
