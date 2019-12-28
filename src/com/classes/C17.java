package com.classes;

interface Default
{
    void abc();    //functional interface
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
    public void show()                     // method over riding is possible
    {
        System.out.println("in new show");
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
