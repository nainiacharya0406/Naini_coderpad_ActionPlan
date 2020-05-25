package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {
	
	//********First Repeated char********
	
	public static char firstRepeated(String str) {
		Set<Character> set = new HashSet<Character>();
		int i=0;
		while(i < str.length()) {
			if(set.contains(str.charAt(i))) {
				return str.charAt(i);
			}else {
				set.add(str.charAt(i));
			}
			i++;
		}
		return 0;
	}
	//******First Non-Repeated char******
	 
	public static void firstNonRepeated(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i< str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> temp : map.entrySet()) {
			if(temp.getValue() ==1) {
				System.out.println(temp.getKey());
			}
		}		
	}
	
	//******Most Repeated char******
	public static int mostRepeated(String str) {
		int count=0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i< str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> temp : map.entrySet()) {
			if(count < temp.getValue()) {
				count = temp.getValue();
			}
		}
		return count; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbbccdekjk";
		char ch = firstRepeated(str);
		System.out.println("First repeated character : " + ch);
		System.out.println("Max repeated character : "+mostRepeated(str));

	}

}
