package com.ksr;
class Animal
{
    public void animalSound()
    {
        System.out.println("The Animal Make a Sound ");
    }
}
class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("Dog saya: Bow wow");
    }
}
public class Polymorphism {

    public static void main(String[] args)
    {
        Animal obj=new Animal();
        Animal obj1=new Dog();
        Animal obj2=new Pig();
        obj.animalSound();
        obj1.animalSound();
        obj2.animalSound();
    }
}
