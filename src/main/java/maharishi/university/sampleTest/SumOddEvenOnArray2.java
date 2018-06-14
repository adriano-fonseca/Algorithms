package maharishi.university.sampleTest;

import java.util.Arrays;

public class SumOddEvenOnArray2 {
	public static void main(String[] args){
		int[] array = {3,3,4,4};
		System.out.println(SumOddEvenOnArray2.f(array));
	}
  
	static int f(int[] array) {
		int sumEven = Arrays.stream(array).filter(x -> x%2==0).sum();
		int sumOdd = Arrays.stream(array).filter(x -> x%2!=0).sum();
		return sumOdd - sumEven;
	}
}
