package com.hackerrank;

public class StairCaseGood {
  public static void main(String args[]) {
    StairCase(9);
  }

  static void StairCase(int n) {
    printLadder(1, n+1);
  }

  static void printLadder(int currentStep, int n) {
    int nrSpaces = n-currentStep; //5
    int nrSimbol = currentStep; //1
    if(currentStep<n){
    	printStep(nrSpaces,nrSimbol);
    	printLadder(currentStep+1,n);
    }else{
      return;
    }
  }

  private static void printStep(int nrSpaces, int nrSimbol) {
    printChar(1,nrSpaces,' ');
    printChar(0,nrSimbol,'#');
    System.out.println();
  }

  private static void printChar(int ind, int times, char c) {
    if(ind<times){
      System.out.print(c);
      printChar(ind+1, times, c);
    }else{
      return;
    }
  }

}
