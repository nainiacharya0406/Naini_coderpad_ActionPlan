package com;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,4,7,8,9,1};
		int[] arr2 = {7,4,8,9,1,2};
		System.out.println(checkEqual(arr1, arr2));

	}

	private static boolean checkEqual(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		int count = 0; 	
		for(int i=0; i<arr1.length; i++) {
			if(map1.containsKey(arr1[i])){
				map1.put(arr1[i], map1.get(arr1[i])+1);
			}else {
				map1.put(arr1[i], 1);
			}
		}

		for(int i=0; i<arr2.length; i++) {
			if (!map1.containsKey(arr2[i])) 
				return false; 
			if (map1.get(arr2[i]) == 0) 
				return false; 

			count = map1.get(arr2[i]); 
			--count; 
			map1.put(arr2[i], count); 

		}
		return true;
	}
}

