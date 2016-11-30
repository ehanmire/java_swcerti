 import java.util.Scanner;
 import java.io.FileInputStream;
 
 
 public class DivideFloat2 { 
	 
	 public static void main(String[] args) throws Exception{
		 
		 System.setIn(new FileInputStream("C:\\sample_input.txt"));
		 Scanner sc = new Scanner(System.in); 
		 
		 int T = sc.nextInt();
		 
		 for (int test_case = 1; test_case <= T; test_case++) {			 
			int arr[] = new int[4]; 
			
			for (int i = 0; i < 4; i++) { 
				arr[i] = sc.nextInt(); 
			} 
			 
			int a, b; 
			 
			// ((a1 * b2) + (b1 * a2)) / (a2 * b2)
			a = arr[0] * arr[3] + arr[2] * arr[1]; 
			b = arr[1] * arr[3]; 
			 
			double Ans = (double) a / (double) b; 
			 
			 
			System.out.printf("#%d %.13f\n", test_case, Ans);
		}
	}
 } 