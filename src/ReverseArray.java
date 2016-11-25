import java.io.FileInputStream;
import java.util.*;

class ReverseArray{
	
	public static void main(String args[]) throws Exception{
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		for(int case_no = 1; case_no <=T; case_no++){
			
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int[][] tmp = new int[N][N];
			
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			
			// horizontal reverse
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					tmp[i][j] = arr[i][N-j-1];
				}
			}
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					arr[i][j] = tmp[i][j];
				}
			}
			
			// vertical reverse and
			//print tmp[][] as a result, not using arr[][]
			System.out.println("#"+case_no);
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					tmp[i][j] = arr[N-i-1][j];
					System.out.print(tmp[i][j]);
					if(j < N-1){
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
			
			
		}
	}
}