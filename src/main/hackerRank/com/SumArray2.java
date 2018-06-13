package hackerRank.com;

import java.util.Arrays;

public class SumArray2 {
  public static void main(String args[]) {
    System.out.println(sumArraySolution(new int[]{1,2,3,4,5}));
  }

  static int sumArraySolution(int[] array) {
    int sum = Arrays.stream(array).sum();
    return sum;
  }

}
