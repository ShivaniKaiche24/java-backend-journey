package com.Day1;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====For Loop : Numbers from 1 to 10=====");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("\n=====While Loop : Even Numbers from 2 10 20=====");
		
		int number= 2;
		while(number<=20) {
			System.out.println(number);
			number+=2;
		}
		
		System.out.println("\n=== Do While Loop: Countdown from 5 ===");
		
		int count=5;
		do {
			System.out.println(count);
			count--;
		}while(count>=1);
	}

}
