package com;

public class RecurssionFactorial {

	public static int factorial(int n) {
		int fact=1;
		if(n>0) {
			fact = factorial(n-1) *n;
		}
		
		return fact;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(factorial(n));

	}

}
