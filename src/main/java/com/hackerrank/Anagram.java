package com.hackerrank;
import java.util.Scanner;

public class Anagram {

    private static final Scanner scanner = new Scanner(System.in);
    
    
    
    public static boolean isAnagram(String first, String second) {
        if(first.length() != second.length()) 
        	return false;
        
    	int[] charSet = new int[256];
        
        
        for(int i=0; i<first.length(); i++) {
            charSet[first.charAt(i)]++;
        }
        
        for(int i=0; i<second.length(); i++) {
            charSet[second.charAt(i)]--;
        }
        
        
        for(int character : charSet)
            if(character != 0) { 
            	return false; 
            }
        
        return true;
     }
    
    public static int numberNeededSubtractToBeAnAnagram(String first, String second) {
        int[] charSet = new int[256];
        
        for(int i=0; i<first.length(); i++) {
            charSet[first.charAt(i)]++;
        }
        
        for(int i=0; i<second.length(); i++) {
            charSet[second.charAt(i)]--;
        }
        
        int numberNeeded = 0;
        for(int i=0; i<256; i++)
            numberNeeded += Math.abs(charSet[i]);
        
        return numberNeeded;
     }

    public static void main(String[] args) {
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        scanner.close();
    	  System.out.println(numberNeededSubtractToBeAnAnagram("aba", "baaa"));
          System.out.println(isAnagram("aba", "baaa"));
    }
}