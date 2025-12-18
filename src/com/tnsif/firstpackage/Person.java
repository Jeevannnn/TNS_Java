package com.tnsif.firstpackage;

public class Person {

    private String personName;
    protected int personAge;
    protected String personCity;
     
    public Person() {}

    public void setPersonname(String name) {
        this.personName = name;
    }
        
    public String getPersonname() {
        return personName;
    }

    public void display() {
        System.out.println(personName + " " + personAge + " " + personCity);
    }
}