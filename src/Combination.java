import java.util.*;
import java.io.FileInputStream;

class Combination{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no = 1; case_no<=T; case_no++){
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			System.out.print("#"+case_no);
			System.out.print(" "+(Facto(N)/(Facto(K)*Facto(N-K))));
			System.out.println();
		}
		
	}
	
	//Factorial
	private static long Facto(int n){
		if (n==1 || n==0) {
			return 1l;
		}
		else {
			return n * Facto(n-1);
		}
	}
}