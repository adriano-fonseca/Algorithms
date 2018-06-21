package com.hackerrank;

import java.util.Scanner;

public class LeftRotationRecursion {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("type");
	    String[] nd = scanner.nextLine().split(" ");
	    int n = Integer.parseInt(nd[0]);
	    int d = Integer.parseInt(nd[0]);
	    int[] elements = new int[n];
	    
	    String[] aItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    
	    for(int x=0; x< n; x++){
	      int item = Integer.parseInt(aItems[x]);
	      elements[x] = item;
	    }
	    
	    rotLeft(elements,d);
	    

	}

	public static int[] rotLeft(int[] elements, int d) {
		if(d==0) {
			return elements;
		}else {
			d--;
			return rotLeft(performOneRotarion(elements,0,elements[0]),d);
		}
	}

	private static int[] performOneRotarion(int[] elements, int atual, int temp) {
		if(atual==elements.length-1) {
			elements[atual]=temp;
			return elements;
		}else {
			elements[atual] = elements[atual+1];
			return performOneRotarion(elements, atual+1, temp);
		}
		
	}

}
