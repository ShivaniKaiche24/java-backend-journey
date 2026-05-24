package com.studentmanagementsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Student");
			System.out.println("1. Display Student");
			System.out.println("1. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			  
			case 1:
				System.out.println("Add Student Selected");
				break;
			
			case 2:
				System.out.println("Display Student Selected");
				break;
			
			case 3:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Invalid Choice");
			}
			
		}

		
		

	}

}
