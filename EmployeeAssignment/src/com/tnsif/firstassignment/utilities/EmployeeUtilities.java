package com.tnsif.firstassignment.utilities;


import com.tnsif.firstassignment.employees.Developer;
import com.tnsif.firstassignment.employees.Employee;
import com.tnsif.firstassignment.employees.Manager;

public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("---------------------------------");
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: $" + String.format("%,.2f", emp.getSalary()));

        if (emp instanceof Manager) {
            Manager mgr = (Manager) emp; 
            System.out.println("Role: Manager");
            System.out.println("Department: " + mgr.getDepartment());
        }
        
        else if (emp instanceof Developer) {
            Developer dev = (Developer) emp; 
            System.out.println("Role: Developer");
            System.out.println("Programming Language: " + dev.getProgrammingLanguage());
        }
        System.out.println("---------------------------------");
    }

 
    public static void giveRaise(Employee emp, double percentage) {
        double currentSalary = emp.getSalary();
        double newSalary = currentSalary * (1 + (percentage / 100));
        emp.setSalary(newSalary);
        System.out.println("Gave a " + percentage + "% raise to " + emp.getName() + ". New salary: $" + String.format("%,.2f", newSalary));
    }
}