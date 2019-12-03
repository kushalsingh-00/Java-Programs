package com.classes;

public class C6 {
    int modelYaer;
    String modelName;

    public C6(int year,String name) {
        modelYaer = year;
        modelName = name;
    }

     public static void main(String[] args) {
        C6 myCar=new C6(2020,"Model 3");
        System.out.println(myCar.modelYaer+" "+myCar.modelName);
    }

}
