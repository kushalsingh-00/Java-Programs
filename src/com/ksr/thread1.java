package com.ksr;

class Hi1 extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
           try{ Thread.sleep(1500);} catch(Exception e){}    // this will take the specified time
        }
    }
}
class Hello1 extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try{ Thread.sleep(1500);} catch(Exception e){}
        }
    }
} 
public class thread1 {
    public static void main(String[] args)
    {
        System.out.println("Thread");        // all the execution is done by main thread here
        Hi1 obj1=new Hi1();
        Hello1 obj2=new Hello1();

        obj1.start();
        obj2.start();

//        obj1.show();
//        obj2.show();
    }
}
