package com.Day1;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====Even Odd Checker=====");
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		if(num %2 == 0) {
			System.out.print("The Number is Even Number");
		}
		else {
			System.out.print("The Number is Odd Number");
		}
		
		scan.close();
	}
        
}
