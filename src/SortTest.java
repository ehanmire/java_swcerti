import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileInputStream;

class SortTest{

	static int N;
	static int K;
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 0; test_case<T; test_case++){
			
			N = sc.nextInt();
			K = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			
			Arrays.sort(arr, 0, N, new Comp1());
			
			System.out.println("#"+(test_case+1));
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}			
		}

	}
	
	static class Comp1 implements Comparator<int[]>{
		@Override
		public int compare(int[] arg0, int[] arg1){
			return arg0[K-1] - arg1[K-1];
		}
	}
}