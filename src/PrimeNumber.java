import java.io.FileInputStream;
import java.util.*;

class PrimeNumber{
	
	// Ref. site: http://marobiana.tistory.com/91
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no=1; case_no<=T; case_no++){
			int bot = sc.nextInt();
			int top = sc.nextInt();
			int Answer = 0;
			boolean isPrime;
			
			if (bot == 1) {
				bot = 2;
			}
			
			for(int n=bot; n<=top; n++){
				isPrime = true;
				
				for(int j=2; j<n; j++){
					if(n%j==0){
						isPrime = false;
						break;
					}
				}
				
				if(isPrime == true){
					Answer++;
				}
			}
			
			System.out.println("#"+case_no+" "+Answer);
		}
	}
}