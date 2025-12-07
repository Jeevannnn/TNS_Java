package com.tnsif.firstpackage;

public class Person {

	private String personName;
	protected int personAge;
	 String personCity;
	 
	 public Person() {
		// TODO Auto-generated constructor stub
	}

	 public void setPersonname(String name) {
		 this.personName=personName;
	 }
		
	 public int getPersonname() {
		 return personAge;
	 }
	public void display () {
		System.out.println(personName+personAge+personCity);
	}
}
