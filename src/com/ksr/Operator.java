package com.ksr;

public class Operator {
    public static void main(String[] args) {
        int w=6;
        int x = 3;
        int y = 5;
        int z=4;
        int a = 4 + 4;      //8
        int b = 4 - 2;      //2
        int c = 4 * 4;      //16
        int d = 24 / 3;     //8
        int e = 45 % 4;     //1
        int f = ++x;        //4
        int g = --x;        //3
        y += 3;             //8
        z^=4;               //0
        int h=w<<3;         //48
        int i=w>>3;         //0
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.println(d);
        System.out.println(e);
        System.out.print(f);
        System.out.print(g);
        System.out.print(y);
        System.out.println(z);
        System.out.println(h);
        System.out.print(i);

    }
}
