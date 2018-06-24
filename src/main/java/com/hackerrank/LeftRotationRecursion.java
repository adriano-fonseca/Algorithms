package com.hackerrank;

import java.util.Scanner;

public class LeftRotationRecursion {
	private static final Scanner scanner = new Scanner(System.in);

	static int[] rotLeft(int[] a, int d) {
		for(int i = 0; i < d; i++){
			rotatioLeftOne(a);
		}
		return a;
	}

	public static void rotatioLeftOne(int[] a) {
		int i, temp;
		temp = a[0];

		for (i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		
		a[i] = temp;
	}

}
