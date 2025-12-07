package com.tnsif.arrays;

public class Arraysactivity {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {100,90,600,40,80};
		
		for (int pass = 0; pass < arr1.length - 1; pass++) {
			for (int i = 0; i < arr1.length - 1 - pass; i++) {
				if (arr1[i+1] < arr1[i]) {
					int temp = arr1[i];
					arr1[i] = arr1[i+1];
					arr1[i+1] = temp;
				}
			}
		}
		
		// Print the sorted array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}