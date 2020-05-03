package com.ksr;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id,String name,String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class HashMap_UserDefinedObject{
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap=new HashMap<>();

        employeeMap.put(1001,new Employee(1001,"Jack","Mumbai"));
        employeeMap.put(1002,new Employee(1002,"Jhon","Bhopal"));

        System.out.println(employeeMap);

    }
}