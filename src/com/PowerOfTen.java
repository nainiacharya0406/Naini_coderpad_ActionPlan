package com;

public class PowerOfTen {

	public static void main(String[] args) {
		System.out.println(checkPower(10000000));

	}

	private static Boolean checkPower(int data) {
		int i=0;
		int num=1;
		while(num < data) {
			num = num *10;
			if(num == data) {
				return true;
			}
		}
		return false;
	}

}
