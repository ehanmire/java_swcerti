import java.io.FileInputStream;
import java.util.*;

class SumInteger {
	
	static int T, N;
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();		
		
		for(int case_no=1; case_no<=T; case_no++) {
			
			int[] arr = new int[6];
			int tot  = 0;
			
			for(int i=0; i<6; i++) {
				arr[i] = sc.nextInt();
				tot += arr[i];
			}
			
			int sum1 = 0;
			int sum2 = tot;
			
			for(int i=0; i<6; i++){
				for(int j=i+1; j<6; j++) {
					for(int k=j+1; k<6; k++) {
						int tmp = arr[i]+arr[j]+arr[k];
						if(Math.abs(tmp - (tot-tmp)) < Math.abs(sum1 - sum2)) {
							sum1 = tmp;
							sum2 = tot - tmp;
						}
					}
				}
			}
			
			if (sum1 > sum2) {
				System.out.println("#"+case_no+" "+sum2+" "+sum1);
			} else {
				System.out.println("#"+case_no+" "+sum1+" "+sum2);
			}
		}
	}
	

}