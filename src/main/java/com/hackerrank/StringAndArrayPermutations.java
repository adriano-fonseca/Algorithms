package hackerRank.com;

import java.util.ArrayList;
import java.util.List;

import util.UtilArray;
/*
 * Permutation with n elements distincts is n!.
 * EX: To 4 distinct elements:
 *		
 *  !4=4.3.2.1 = 24
 *
 * */
public class StringAndArrayPermutations {
	public static void main(String[] args) {
		String w1 = "1234";
		permutation(w1);
		
		int[] a = {1, 2, 3, 4};
		List<int[]> results = new ArrayList<int[]>();
		permutation(a, 0, results);
		for(int[] ar : results) {
			UtilArray.printArray(ar);
			System.out.println("");
		}
		System.out.print(results.size());
		
	}

	private static ArrayList<String> permutation(String w1) {
		ArrayList<String> result = new ArrayList<String>();
		performPermutation("", w1, result);
		System.out.println(result.toString());
		System.out.println(result.size());
		return result;
	}

	private static void performPermutation(String prefix, String suffix, List<String> result) {
			if(suffix.length()==0) {
				result.add(prefix);
			} else {
				for(int i = 0; i < suffix.length(); i++ ) {
					String newPrefix = prefix + suffix.charAt(i); // 1 //12 //123 
					String newSuffix = suffix.substring(0,i) + suffix.substring(i+1, suffix.length());  //234 //34 //4
					performPermutation(newPrefix, newSuffix, result);
				}
			}
	}
	
	private static void permutation(int[] a, int start, List<int[]> results){
		if(start>=a.length) {
			results.add(a.clone());
		}else {
			for(int i =start; i <a.length; i++) {
				swap(a, start, i);
				permutation(a, start+1, results);
				swap(a, start, i);
			}
		}
	}
	
	private static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
