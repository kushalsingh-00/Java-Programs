package com.ksr;
interface Ab
{
    void show();
}


public class Anonymous_interface
{
    public static void main(String[] args)
    {
        Ab obj=new Ab() {                  // anonymous class
            @Override
            public void show() {
                System.out.println("in main");
            }
        };
        obj.show();
    }
}
