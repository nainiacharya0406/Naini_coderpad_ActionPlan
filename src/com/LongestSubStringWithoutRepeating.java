package com;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {

	//Que : Given a string, find the length of the longest substring without repeating characters.
	//Source : https://leetcode.com/problems/longest-substring-without-repeating-characters/
	//Difficulty : medium

	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<Character>();
		int i =0; int max=0; int j=0;
		while(i<s.length()) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i++));
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(j++));
			}
			
		}


		return max;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcbbcdef";
		int res = lengthOfLongestSubstring(str);
		System.out.println(res);
	}

}
