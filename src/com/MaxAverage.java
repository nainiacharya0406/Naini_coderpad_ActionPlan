package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAverage {

	public static int average(String[][] arr) {
		 Map<String, List<String>> map = new HashMap<>();
		 for(String[] s : arr) {
			 if(map.containsKey(s[0])) {
				 map.get(s[0]).add(s[1]);
			 }else {
				 List<String> list = new ArrayList<>();
					list.add(s[1]);
					map.put(s[0], list);
			 }
		 }
		 int max = 0;
			for(Map.Entry<String, List<String>> s:map.entrySet()) {
				int l = s.getValue().size();
				int avg = 0;
				avg = sum(s.getValue())/l;
				if(max<avg) {
					max = avg;
				}
			}
			return max;
		}

		public static int sum(List<String> list) {
			int sum = 0;
			for(int i=0;i<list.size();i++) {
				sum += Integer.parseInt(list.get(i)); 
			}
			return sum;
		}
	
	public static void main(String[] args) {
		String[][] arr = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
		System.out.println(average(arr));

	}

}
