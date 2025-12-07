package com.tnsif.generics;
import java.util.ArrayList;

public class WithoutGenericsDemo {

	public static void main(String[] args) {
		// Use a typed ArrayList to avoid runtime ClassCastException
		ArrayList<String> al = new ArrayList<>();
		al.add("String");
		// add numeric value as a String (or remove it) so the list stays homogenous
		al.add(String.valueOf(123));

		for (String s : al) {
			System.out.println(s);
		}
	}

}