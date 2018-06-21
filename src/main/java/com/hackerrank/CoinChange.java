package com.hackerrank;

public class CoinChange {

	public static void main(String[] args) {
		// 1111 
		// 112
		// 22
		int[] coins = {1,2};
		int combs = doChange(4,coins,0);
		System.out.println(combs);

	}

	private static int doChange(int amount, int[] coins, int coin) {
		int combs = 0;
		
		if(amount == 0){
			return 1;
		}else if(amount < 0){
			return 0;
		}else {
			for(int i=coin; i < coins.length; i++){
				combs+=doChange(amount-coins[i],coins, i);
			}
		}
		
		return combs;
	}

}
