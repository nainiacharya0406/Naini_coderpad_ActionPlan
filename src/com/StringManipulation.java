package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {

	
	/*
	 * public static Map<Character, Integer> common(String str) { Map<Character,
	 * Integer> map = new HashMap<Character, Integer>(); for(int i=0; i<
	 * str.length(); i++) { if(map.containsKey(str.charAt(i))) {
	 * map.put(str.charAt(i), map.get(str.charAt(i))+1); }else {
	 * map.put(str.charAt(i), 1); } }
	 * 
	 * return map; }
	 */

	//********First Repeated char********
	public static void firstRepeated(String str , CommonImplementation impl) {

		Map<Character, Integer> map = impl.common(str);
		for(int i=0; i<str.length(); i++) {
			if(map.get(str.charAt(i)) >1) {
				System.out.println("First repeated char: "+str.charAt(i));
				break;
			}
		}

	}
	//******First Non-Repeated char******

	public static void firstNonRepeated(String str, CommonImplementation impl) {
		Map<Character, Integer> map = impl.common(str);

		for(Map.Entry<Character, Integer> temp : map.entrySet()) { 
			if(temp.getValue()==1) { 
				System.out.println("First Non-Repeated char: "+temp.getKey()); 
				break;
			} 
		}

		/* map.forEach((k,v) -> System.out.println(k +","+ v)); */
	}

	//******Most Repeated char******
	public static void mostRepeated(String str, CommonImplementation impl) {
		int count=0;
		char ch = 0;
		Map<Character, Integer> map = impl.common(str);
		for(Map.Entry<Character, Integer> temp : map.entrySet()) {
			if(count < temp.getValue()) {
				count = temp.getValue();
				ch = temp.getKey();
			}
		}
		
		System.out.println("Most repeated char is: "+ch +", " + count + " times");
	}
	//******Last non repeated character******
	public static void lastNonRepeated(String str , CommonImplementation impl) {
		Map<Character, Integer> map = impl.common(str);
		for(int i=str.length()-1; i>0 ;i--) {
			if(map.get(str.charAt(i)) == 1) {
				System.out.println("Last non repeated character : "+str.charAt(i));
				break;
			}
		}
	}

	//******Last repeated character ******
	public static void lastRepeated(String str, CommonImplementation impl) {
		Map<Character, Integer> map = impl.common(str);
		for(int i=str.length()-1; i>0 ;i--) {
			if(map.get(str.charAt(i)) > 1) {
				System.out.println("Last repeated character : "+str.charAt(i));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbbccdekjk";
		CommonImplementation impl = new CommonImplementation() {
			
			@Override
			public Map<Character, Integer> common(String str) {
				Map<Character, Integer> map = new HashMap<Character, Integer>();
				for(int i=0; i< str.length(); i++) {
					if(map.containsKey(str.charAt(i))) {
						map.put(str.charAt(i), map.get(str.charAt(i))+1);
					}else {
						map.put(str.charAt(i), 1);
					}
				}

				return map;
			}
		};
		firstRepeated(str,impl);
		firstNonRepeated(str, impl);
		lastNonRepeated(str, impl);
		lastRepeated(str, impl);
		mostRepeated(str,impl);

	}

}

interface CommonImplementation{
	Map<Character, Integer> common(String str);
}
