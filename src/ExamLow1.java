import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;


class ExamLow1{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		//System.out.println(test_case);
		
		for(int i=0; i<test_case;i++){
			
			int n = 0;
			int k = 0;
			// 1<=N<=20, 1<=K<=N
			n = sc.nextInt();   // size of array
			k = sc.nextInt();   // sorting column
			
			int[][] arr = new int[n][n];
			//int[][] tmp = new int[n][n];
			
			for(int l=0; l<n; l++){
				for(int m=0; m<n; m++){
					arr[l][m] = sc.nextInt();
					//System.out.print(arr[l][m]);
				}
				//System.out.println();
			}
			
		
		}
	}
}