package com.company;

public class User {
   private String firstName;
   private  String lastName;
   private int age;
   private double salary;

    public void setAge(int age) {
        System.out.println("Setting Age");
        this.age = age;
        //else System.out.println("Not a valid age");
    }

    public void setSalary(double salary) {
        System.out.println("Setting  salary");
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        System.out.println("Setting firstname");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        System.out.println("Setting LastName");
        this.lastName = lastName;
    }

    public  boolean checkValidAge(int age){
        return (age>0 && age<100) ?true:false;
    }
    public boolean checkValidMemberAge(int age){
        return (age>18 && age<60) ?true:false;
    }
    public  String getFullName(){
        return firstName+" "+lastName;
    }
}
