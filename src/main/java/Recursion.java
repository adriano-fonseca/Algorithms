
public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(sumPrev(3));
	}

	private static int sumPrev(int x) {
		if(x==0) {
			return x;
		}else {
			return x+sumPrev(x-1);
		}
	}
	
	private static int factorial(int x) {
		if(x==1) {
			return 1;
		}else {
			return x*factorial(x-1);
		}
	}
}
