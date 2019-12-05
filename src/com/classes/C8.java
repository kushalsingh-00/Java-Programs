package com.classes;

class Emp
{
    int eid;
    int salary;
    static String ceo;

    public Emp()
    {
        ceo="Navin";
    }

    public void show()
    {
        System.out.println(eid+" : "+salary+" : "+ceo);
    }
}


public class C8 {


    public static void main(String[] args)
    {
        Emp mahesh=new Emp();
        mahesh.eid=8;
        mahesh.salary=40000;

        Emp rahul =new Emp();
        rahul.eid=9;
        rahul.salary=50000;

        mahesh.show();
        rahul.show();

    }
}
