import java.io.FileInputStream;
import java.util.*;

class PrintDiamond{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T;test_case++){
			System.out.println("#"+test_case);
			int N = sc.nextInt();
			int mid = N/2;
			for(int i=0; i<N; i++){
				if(i <= mid) { // top
					for(int j=0; j<N; j++){
						if(j<=mid){ // left half
							if(j == mid - i) {
								System.out.print("*");
							}
							else             {
								System.out.print(" ");
							}
						}
						else{ 	// right half
							if(mid == j - i) {
								System.out.print("*");
							}
							else             {
								System.out.print(" ");
							}					
						}
					}
				}
				else{  // bottom
					for(int j=0; j<N; j++){
						if(j<=mid){ // left half
							if(mid == i - j) {
								System.out.print("*");
							}
							else             {
								System.out.print(" ");
							}
						}
						else{ 	// right half
							if((j-N+i) == (mid-1)) {
								System.out.print("*");
							}
							else             {
								System.out.print(" ");
							}					
						}
					}
				}
				System.out.println();
			}
		}
	}
}

