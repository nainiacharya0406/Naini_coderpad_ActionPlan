package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueChar {

	public static void main(String[] args) {
		String str = "abfnek$njdf";
		System.out.println(findSpecialCharacter(str));

	}

	private static boolean findSpecialCharacter(String str) {
		 Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
	     Matcher matcher = pattern.matcher(str);
	     boolean b = matcher.find();
		if(b) {
			return true;
		}	
		return false;		
	}

}
