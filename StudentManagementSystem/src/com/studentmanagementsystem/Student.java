package com.studentmanagementsystem;

public class Student {

	int id;            // instance variables / fields
	String name;
	double marks;
	
	
	public Student (int id , String name , double marks) { //Constructors are special methods automatically called during object creation
		this.id=id; //this.id--> current object  id --> Constructor parameter and this value would be given by user when the object is created 
		this.name=name;
		this.marks=marks;
	}
	
	public void displayStudent() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
}
