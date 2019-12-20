package com.classes;

public class C13 {
    private String name;
    private int rollno;

    public void setName(String a)
    {
        name=a;
    }
    public String getName()
    {
        return name;
    }

    public void setRollNo(int b)
    {
        rollno=b;
    }

    public int getrollNO()
    {
        return rollno;
    }

    public static void main(String[]args)
    {
        C13 obj=new C13();
        obj.setName("kushal");
        System.out.println(obj.getName());
        obj.setRollNo(13);
        System.out.println(obj.getrollNO());
    }

}
