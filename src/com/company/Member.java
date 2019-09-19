package com.company;

import javax.naming.Name;
import java.awt.print.Pageable;
import java.security.PublicKey;

public class Member {
    private String name;
    private int Age;
    private double salary;



    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
        //public
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return name;
    }
}
