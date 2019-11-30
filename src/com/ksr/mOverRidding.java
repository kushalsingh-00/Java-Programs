package com.ksr;

public class mOverRidding {
    static int plusInt(int a,int b) {
        return a+b;
    }

    static double plusInt(double a,double b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a=plusInt(2,3);
        double b=plusInt(3.5,3.1);
        System.out.println(a+"   "+b);
    }
}
