package com;

//Is String Palindrome
public class IsStringPalindrome {

	public static Boolean isPalindrome(String s) {
		Boolean res = true;
		int first=0;
		int last = s.length()-1;
		while(first<s.length()/2) {
			if(s.charAt(first) != s.charAt(last)) {
				return false;
			}
			first++;
			last--;
			
		}
		
		return res;

	}
	public static void main(String[] args) {
			System.out.println(isPalindrome("cbabc"));;
	}

}
