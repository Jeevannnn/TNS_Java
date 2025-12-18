package com.tnsif.scanner;

import java.util.Scanner;

public class SchoolScanner {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input school name
        System.out.println("Enter the name of the school:");
        String schoolName = sc.nextLine();

        // Create School object using the input
        School mySchool = new School(schoolName);

        // Display the result
        System.out.println("School details: " + mySchool.toString());

        sc.close();
    }
}