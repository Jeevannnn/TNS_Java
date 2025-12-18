package com.tnsif.generics;

import com.tnsif.firstpackage.Person;

public class Person1 extends Person {

    public Person1(String name, int age, String city) {
        
        this.personAge = age;
        this.personCity = city;
        this.setPersonname(name); 
    }

    @Override
    public String toString() {
        return "Person [Name=" + getPersonname() + ", Age=" + personAge + ", City=" + personCity + "]";
    }
}