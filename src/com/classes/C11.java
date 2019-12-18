package com.classes;

public class C11 {
    public class Array
    {
     int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    }

    public static void main(String[] args)
    {
        C11 Obj1=new C11();
        C11.Array Obj2=Obj1.new Array();
       // System.out.println(Obj2.a[0][1]);

        for(int i[]:Obj2.a)
        {
            for(int j:i)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
