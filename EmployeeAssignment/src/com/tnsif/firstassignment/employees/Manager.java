package com.tnsif.firstassignment.employees;


public class Manager extends Employee {
   
    private String department;
    public Manager(String name, long employeeId, double salary, String department) {
        super(name, employeeId, salary); // Calls the public constructor of the parent class
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}