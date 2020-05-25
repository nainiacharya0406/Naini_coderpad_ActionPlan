package com;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abbbbcdeee";
		int[] res = calculate(str);
		System.out.println("["+res[0] +", "+res[1]+"]");

	}

	private static int[] calculate(String str) {
		int count=0;
		int max_soFar = Integer.MIN_VALUE;
		int start =0;
		int[] res = new int[2];
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				count =0;
			}
			if(max_soFar < count) {
				max_soFar = count;
				start = i -count +1;
				res[0] = max_soFar+1;
				res[1] = start;
			}
		}
		return res;
				
	}

}
