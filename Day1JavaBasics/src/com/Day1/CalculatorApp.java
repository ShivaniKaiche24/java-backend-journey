package com.Day1;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("=== Simple Calculator ===");

	        System.out.print("Enter first number: ");
	        double firstNumber = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double secondNumber = scanner.nextDouble();

	        System.out.print("Enter operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result;

	        switch (operator) {
	            case '+':
	                result = firstNumber + secondNumber;
	                System.out.println("Result: " + result);
	                break;

	            case '-':
	                result = firstNumber - secondNumber;
	                System.out.println("Result: " + result);
	                break;

	            case '*':
	                result = firstNumber * secondNumber;
	                System.out.println("Result: " + result);
	                break;

	            case '/':
	                if (secondNumber != 0) {
	                    result = firstNumber / secondNumber;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;

	            default:
	                System.out.println("Invalid operator entered.");
	        }

	        scanner.close();
	    }
}
