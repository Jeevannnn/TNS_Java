package com.tnsif.arrays;
import java.util.Scanner;
public class ArraysDemo {

	public static void main(String[] args) {
		String days[] = new String[7];
		Scanner sc = new Scanner(System.in);
		for (int i= 0; i<days.length;i++) {
			System.out.println("Please enter the" +i+ "th day of the week");
			days[i] = sc.nextLine();
	
		}
		System.out.println();
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]);
		}
	}
}