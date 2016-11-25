import java.io.FileInputStream;
import java.util.*;

class ProbSum{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no=1; case_no<=T; case_no++){
			int N = sc.nextInt();
			int arr[] = new int[N];
			int sum[] = new int[N*N];
			
			for(int i=0; i<N; i++){
				arr[i] = sc.nextInt();
			}
			
			int j=0;
			
			for(int i=0; i<N; i++){				
				for(int k=i+1; k<N; k++){
					sum[j] = arr[i] + arr[k];
					j++;
				}
			}
			
			Arrays.sort(sum, 0, j);
			
			int Answer = 0;
			int tmp = 0;
			
			for(int i=0; i<j; i++){
				//System.out.print(sum[i]+" ");
				if(i==0) {
					tmp = sum[0];
					Answer++;
				}
				else if(tmp==sum[i]){
					continue;					
				}
				else {
					tmp = sum[i];
					Answer++;
				}
			}
			System.out.println("#"+case_no+" "+Answer);
			
		}
	}
}