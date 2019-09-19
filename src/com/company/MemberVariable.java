package com.company;

import org.w3c.dom.ls.LSOutput;

public class MemberVariable {
    Member member=new Member();
    public void createClass(String Name, int Age, double salary){
        member.setAge(Age);
        member.setSalary(salary);
        member.setName(Name);

        System.out.println(member.getAge());
        System.out.println(member.getName());
        System.out.println(member.getSalary());

    }
}
