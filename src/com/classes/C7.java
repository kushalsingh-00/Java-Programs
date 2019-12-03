package com.classes;

class calc
{
    int a;
    int b;
    int res;

    public calc()
    {
        a=32487837;
        b=1;
    }

    public calc(int c,double d)
    {
        a=(int) (c+d);
    }

}

public class C7 {
    public static void main(String args[])
    {
        calc obj1=new calc();
        calc obj=new calc(3,4.1);
        System.out.println(obj1.a);
        System.out.println(obj.a);
    }
}
