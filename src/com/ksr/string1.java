package com.ksr;

public class String1 {
    public static void main() {
        String a="Hello";
        int b=a.length();
        System.out.println("length of string a is ="+b);
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase()+"\n");


        String text="i am learning java";
        System.out.println(text.indexOf("am /n"));


        String c="john";
        String d="roy";
        System.out.println("concating c nad d"+c+" "+d);
        System.out.println(c.concat(d)+"\n");


        System.out.println("For using some special character in string use \\ after thar special character");
        String e="\"lion\" ";
        String f="Its\'s alright";

    }
}
