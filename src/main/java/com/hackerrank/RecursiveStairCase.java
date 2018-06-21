package hackerRank.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveStairCase {


	
	  	static int stepPerms(int n) {
	  		int[] steps = {1,2,3};
	  		return performClimbDP(n, steps);
	    }
	  	
		
	  	private static int performClimbDP(int n, int[] steps) {
		  	if(n == 0) return 1;
	  		int[] result = new int[n + 1];
	  		
		  	result[0] = 1;

  				for(int i = 1; i <= n; i++){
  					int total = 0;
  					for(int stepSize : steps){
						if(i - stepSize >= 0){
							total += result[i - stepSize];
						}
						result[i] = total;
	  				}
  				}
  			
			return result[n];
		}

	  	
	  	//Resolve mais da Timout
	  	private static int performClimb(int n, int[] steps) {
	  		if( n == 0){
				return 1;
			}
			
			int total = 0;
			for(int i=0; i < steps.length;  i++){
				if(n-steps[i] >= 0){
					total += performClimb(n-steps[i], steps);
				}
			}
			return total ;
		}

		//Resolve mais da timeout
	  	static int performClimb(int n, int step, int[] steps){
			int ways = 0;	
			
	  		if(n == 0){
	  			return 1;
	  		} else if( n < 0){
	  			return 0;
	  		} else {
	  			for(int i =0; i < steps.length; i++) {
	  				ways+=performClimb(n-steps[i], steps[i], steps);
		  		}
	  		}
			return ways;
	  	}
	  
	    private static final Scanner scanner = new Scanner(System.in);

	  	 public static void main(String[] args) throws IOException {
	         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/adriano/git/output.txt"));

	         int s = scanner.nextInt();
	         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	         for (int sItr = 0; sItr < s; sItr++) {
	             int n = scanner.nextInt();
	             scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	             int res = stepPerms(n);

	             bufferedWriter.write(String.valueOf(res));
	             bufferedWriter.newLine();
	         }

	         bufferedWriter.close();

	         scanner.close();
	     }

}
