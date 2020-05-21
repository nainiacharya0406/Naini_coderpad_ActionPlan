package com;

public class RecurssiveFibonacci {
	
	static int num1 = 0;
	static int num2 = 1;
	static int num3 = 0;
	public static void fibonacci(int n) {
		if(n > 0) {
			int num3 = num1+num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			fibonacci(n-1);
		}	
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(num1);
		System.out.println(num2);
		fibonacci(n-2);

	}

}
