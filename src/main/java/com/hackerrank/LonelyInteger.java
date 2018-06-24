package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LonelyInteger {

	public static void main(String[] args) {
		int[] a = {4, 9, 95, 93, 57, 4, 57, 93, 9};
		HashMap<Integer, Integer> map = new HashMap<>();

		
		for(int n: a){
			if(map.containsKey(n)){
				map.remove(n);
			}else {
				map.put(n, n);
			}
		}
        
		System.out.println(map.keySet().iterator().next());
       
     }

	private static void printItems(Map<Integer, Long> map) {
		for (Entry<Integer, Long> entry : map.entrySet()) {
			System.out.println("Word: " + entry.getKey() + " Times: " + entry.getValue());
		}

	}
}
