package com.hackerrank;

public class Solution {
	static void countSwaps(int[] a) {
	     int swapsCount = 0;

		for(int i = a.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				
				// To change sort to Descending change to <
				if(a[j] > a[j + 1]){
					swapsCount++;
					swap(j, j+1, a);
				}
			}
		}
	     System.out.println("Array is sorted in "+swapsCount+" swaps.");
	     System.out.println("First Element: "+a[0]);
	     System.out.println("Last Element: "+a[a.length-1]);
	        

	    }

	      public static void swap(int indexOne, int indexTwo, int[] theArray) {
	        int temp = theArray[indexOne];
	        theArray[indexOne] = theArray[indexTwo];
	        theArray[indexTwo] = temp;
	    }
	      
	  public static void main(String[] args){
		  int[] a = {5, 3, 2, 1};
		  Solution.countSwaps(a);
	  }
}
