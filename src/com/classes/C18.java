package com.classes;

interface Static
{
    int num=8;              // it act as a final variable (constant)
    void abc();
    static void show()
    {
        System.out.println("in show");
    }

}

class DefImp1 implements Static{
    public void abc()
    {

    }

}
public class C18 {
    public static void main(String[] args)
    {
        Static.show();
    }
}
