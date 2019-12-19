package com.classes;

public class C12
{
    class A
    {

        public A()
        {
            System.out.println("in A");
        }

        public A(int a)
        {
            System.out.println("in A int ");
        }
    }

    class B extends A
    {
        public B()
        {
            super(6);
            System.out.println("in B");
        }

        public B(int b)
        {
            super();
            System.out.print("in B int");
        }
    }


    public static void main(String[] args)
    {
        C12 obj=new C12();
        C12.B obj1=obj.new B();

    }
}
