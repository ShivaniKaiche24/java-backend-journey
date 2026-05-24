package com.Day1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("=====Largest Number Finder=====");
		
		System.out.println("Enter first number ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number ");
		int secondNumber=sc.nextInt();
		
		System.out.println("Enter third number ");
		int thirdNumber = sc.nextInt();
		
		int largestNumber;
		
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber) {
			largestNumber= firstNumber;
			
		}
		else if(secondNumber>=firstNumber && secondNumber>=thirdNumber) {
			largestNumber=secondNumber;
		}
		else {
			largestNumber=thirdNumber;
		}

		System.out.println("Largest Number is : "+largestNumber);
		
		sc.close();
	}

}
