package com.tnsif.firstassignment.employees;


public class Employee {
  
    private String name;
    private long employeeId;
    private double salary;
    public Employee(String name, long employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}