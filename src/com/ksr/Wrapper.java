package com.ksr;

public class Wrapper {

    public static void main(String[] args)
    {
        int i=5;
        Integer ii=new Integer(i);  //Boxing - wrapping

        int j=ii.intValue();  //unboxing - unwrapping

        Integer value =i;  //AutoBoxing

        int k=value;  //autounboxing

        String n="123";
        int a=Integer.parseInt(n);
    }
}
