package com;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(isUgly(300));

	}

	private static Boolean isUgly(int num) {
		num = divide(num, 2);
		num = divide(num, 3);
		num = divide(num, 5);
		if( num == 1) {
			return true;
		}
		
		return false;
	}

	private static int divide(int num, int i) {
		while(num % i == 0) {
			num = num/i;
		}
		return num;
	}

}
