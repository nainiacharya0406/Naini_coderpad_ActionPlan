package com;

import java.util.HashMap;
import java.util.Map;

public class RoboCordinate {

	public static void main(String[] args) {
		String str = "UDDLLRUUUDUURUDDUULLDRRRR";
		int[] cordinates = calculate(str);
		System.out.println("Co-ordinates are : ["+cordinates[0]+" ,"+cordinates[1]+"]");

	}

	private static int[] calculate(String str) {
		int getCountU = 0;
		int getCountD = 0;
		int getCountR = 0;
		int getCountL =0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> temp : map.entrySet()) {
			if(temp.getKey() == 'U') {
				getCountU = temp.getValue();
			}else if(temp.getKey() == 'D') {
				getCountD = temp.getValue();
			}else if(temp.getKey() == 'R') {
				getCountR = temp.getValue();
			}else if(temp.getKey() == 'L') {
				getCountL = temp.getValue();
			}
		}
		
		int[] cordinates = new int[2];
		cordinates[0] = getCountR - getCountL;
		cordinates[1] = getCountU - getCountD;
		return cordinates;
	}

}
