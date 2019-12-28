package com.classes;

interface Default
{
    void abc();
    default void show()     // by using default method we define method in interface also
    {
        System.out.println("in show");
    }

}

class DefImp implements Default{
    public void abc()
    {
        System.out.print("in abc");
    }

}
public class C17 {
    public static void main(String[] args)
    {
        Default obj=new DefImp();
        obj.abc();
        obj.show();
    }
}
