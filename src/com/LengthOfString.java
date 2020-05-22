package com;

import java.util.HashMap;
import java.util.Map;

public class LengthOfString {

	public static void lengthOfString(String str){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i< str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> temp : map.entrySet()) {
			System.out.print(temp.getKey() +""+ temp.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfString("abcdabcdef");

	}

}
