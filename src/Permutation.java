import java.io.FileInputStream;
import java.util.*;

class Permutation{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no = 1; case_no <=T; case_no++){
			
			int N = sc.nextInt();
			int sum = 0;
			
			for(int i=0; i<N; i++){
				sum += permu(N, N-i);
			}
			
			System.out.println("#"+case_no+" "+sum);
		}
	}
	
	private static long permu(int n, int k){
		return (facto(n) / facto(n-k));
	}
	
	private static long facto(int n){
		if (n==1 || n==0) {
			return 1l;
		}
		else {
			return (n * facto (n-1));
		}
	}
}