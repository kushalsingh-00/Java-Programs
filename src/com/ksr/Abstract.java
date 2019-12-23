package com.ksr;
  //when we make a class abstract no one can make object of it

abstract class Human
{
    public abstract void eat();

    public abstract void walk();
}

class Men extends Human                // this is concrete class
{
    public void eat() {
        System.out.println("men eat food");
    }

    public void walk() {
        System.out.println("men walking");
    }
}

class Woman extends Human
{
    public void eat()
    {
        System.out.println("woman eat food");
    }

    public void walk()
    {
        System.out.println("woman walking");
    }
}

public class Abstract {
    public static void main(String[] args)
    {
        Human obj=new Men();                 //human class is used as refrence class because it is abstruct class
        Human obj1=new Woman();

        obj.eat();

    }
}
