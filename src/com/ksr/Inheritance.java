package com.ksr;

// class which extends another class called IS-A
// class in which we are creating a object of another class called HAS-A

public class Inheritance {
    public class Calc {                                       //super class
        public int add(int a, int b) {
            return a + b;
        }

    }

    public class Calc1 extends Calc {                        //sub class
        public int sub(int a, int b) {                       //single inheritance
            return a - b;
        }
    }
    public class Calc2 extends Calc1 {                        //multi inheritance
        public int mult(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args)
    {
        Inheritance Obj=new Inheritance();
        Inheritance.Calc obj=Obj.new Calc();
        Inheritance.Calc1 obj1=Obj.new Calc1();
        Inheritance.Calc2 obj2=Obj.new Calc2();

        int a=obj.add(2,3);
        int b=obj1.sub(4,2);
        int c=obj2.mult(3,4);

        System.out.print(a+"\n"+b+"\n"+c);
    }


    }
