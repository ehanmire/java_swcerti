import java.io.FileInputStream;
import java.util.*;

class Residu{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no = 1; case_no <=T; case_no++){
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			int cnt = 0;
			
			for(int i=A; i<=B; i++){
				if (D == (i % C)) {
					cnt ++;
				}
			}
			
			System.out.print("#"+case_no+" "+cnt);
			System.out.println();
		}
	}
}