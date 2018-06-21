package com.hackerrank;

public class CoinChangeDP {

	public static void main(String[] args) {
		// 1111 
		// 112
		// 22
		int[] coins = {1,2};
		long combs = coinChange(4,coins);
		System.out.println(combs);

	}
	
//	[0,0,0,0,0]
//	[1,0,0,0,0]
	private static long coinChange(int amount, int[] coins) {
		long[] results = new long[amount+1];
		
		results[0] = 1;
		
			for(int coin : coins){
				for(int i=1; i <= amount; i++){
					if(i>=coin){
						results[i]+=results[i-coin];
					}
				}
				
				
		}
		return results[amount];
	}

}
