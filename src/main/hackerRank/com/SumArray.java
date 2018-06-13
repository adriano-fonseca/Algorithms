package hackerRank.com;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
  public static void main(String args[]) {
    int[] array = readArray();
    System.out.println(sumArraySolution(array));
  }

  static int sumArraySolution(int[] array) {
    int sum = Arrays.stream(array).sum();
    return sum;
  }
  
 static int[] readArray(){
    System.out.println("How many numbers?");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] array = new int[size];
    System.out.println("Digit the number and press Enter");
    for(int x=0; x< size; x++){
      int  members = scanner.nextInt();
      array[x] = members;
    }
    return array;
  }
  

}
