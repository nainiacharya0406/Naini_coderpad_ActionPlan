package com;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "This is a practice program for coderpad";
		reverseString(str);
	}

	private static void reverseString(String str) {
		String result = "";
		String[] split = str.split(" ");
		for(int i=0; i<split.length; i++) {
			result += " "+reverse(split[i]);
		}
		System.out.println(result);
	}

	private static String reverse(String string) {
		String reversed = "";
		for(int i=string.length()-1; i>=0; i--) {
			reversed += ""+string.charAt(i);
		}
		return reversed;
	}

}
