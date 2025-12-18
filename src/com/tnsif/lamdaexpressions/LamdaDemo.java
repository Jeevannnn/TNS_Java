package com.tnsif.lamdaexpressions;

public class LamdaDemo {
    public static void main(String[] args) {
        // 1. Using MyCube Lambda Expression
        // Implementing the getCube(int n) method
        MyCube cube = (n) -> n * n * n;
        int result = cube.getCube(5);
        System.out.println("Cube of 5 is: " + result);

        // 2. Using Operations Lambda Expression for Addition
        // Implementing the perform(int a, int b) method
        Operations add = (a, b) -> a + b;
        System.out.println("Addition (10 + 20): " + add.perform(10, 20));

        // 3. Using Operations Lambda Expression for Multiplication
        Operations multiply = (a, b) -> a * b;
        System.out.println("Multiplication (10 * 20): " + multiply.perform(10, 20));

        // 4. Using Operations for Subtraction
        Operations subtract = (a, b) -> a - b;
        System.out.println("Subtraction (50 - 25): " + subtract.perform(50, 25));
    }
}