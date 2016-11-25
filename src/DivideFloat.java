import java.io.FileInputStream;
import java.util.*;

class DivideFloat{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no=1; case_no<=T; case_no++){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();
			
			//double div1 = (double) a1 / (double) a2;
			//double div2 = (double) b1 / (double) b2;
			
			/*
			 a = arr[0] * arr[3] + arr[2] * arr[1]; 
			 b = arr[1] * arr[3]; 
			 
			 double Ans = (double) a / (double) b; 
			 */
			
			//double sum = div1 + div2;
			
			//double sum = ((double) a1 / (double) a2) + ((double) b1 / (double) b2);
			double sum = (((double) a1 * (double) b2) + ((double) b1 * (double) a2) /
					     ((double) a2 * (double) b2));
			
			System.out.print("#"+case_no+" ");
			System.out.printf("%.13f\n", sum);
		}
	}
}