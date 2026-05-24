package com.studentmanagementsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[5];
		int count =0;
		
		boolean running = true;
		
		while(running) {
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			  
			case 1:
				System.out.println("Enter Student ID: ");
				int id = sc.nextInt();
				
				System.out.println("Enter Student Name: ");
				String name = sc.next();
				
				System.out.println("Enter Student Marks: ");
				double marks= sc.nextDouble();
				
				Student student = new Student(id,name,marks);
				
				students[count] = student;
				count++;
				
				System.out.println("Student Added Successfully");
				
				break;
			
			case 2:
				for(int i =0;i<count;i++) {
					students[i].displayStudent();
				}
				break;
			
			case 3:
				System.out.println("Exiting...");
				running=false;
				break;
			
				
			default:
				System.out.println("Invalid Choice");
			}
			
		}

		
		

	}

}
