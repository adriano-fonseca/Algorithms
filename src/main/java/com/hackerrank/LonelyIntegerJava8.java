package com.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyIntegerJava8 {

	public static void main(String[] args) {
		int[] a = {4, 9, 95, 93, 57, 4, 57, 93, 9};

		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		Map<Integer, Long> mapInt = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<Integer, Long> lonely = mapInt.entrySet().stream()
                .filter(map -> map.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	   
		System.out.println(getLonelyInteger(lonely));
        
       
     }

	private static Integer getLonelyInteger(Map<Integer, Long> map) {
		Integer number = 0;
		for (Entry<Integer, Long> entry : map.entrySet()) {
			if(entry.getValue() == 1){
				number = entry.getKey();
			}
		}
		return number;

	}

	private static void printItems(Map<Integer, Long> map) {
		for (Entry<Integer, Long> entry : map.entrySet()) {
			System.out.println("Word: " + entry.getKey() + " Times: " + entry.getValue());
		}

	}

	public static int numberNeededSubtractToBeAnAnagram(String first, String second) {
		int[] charSet = new int[256];

		for (int i = 0; i < first.length(); i++) {
			charSet[first.charAt(i)]++;
		}

		for (int i = 0; i < second.length(); i++) {
			charSet[second.charAt(i)]--;
		}

		int numberNeeded = 0;
		for (int i = 0; i < 256; i++)
			numberNeeded += Math.abs(charSet[i]);

		return numberNeeded;
	}

}
