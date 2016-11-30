import java.io.FileInputStream;
import java.util.*;

class Melody {
	
	static int T, N;
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();		
		
		for(int case_no=1; case_no<=T; case_no++) {
			
			N = sc.nextInt();
			int[] song   = new int[N];
			
			for(int i=0; i<N; i++) {
				song[i] = sc.nextInt();
			}
			
			int len = 1;
			int[] cnt = new int[N];
			
			for(int k=0; k<N; k++) {
				
				int tmpI = 0;
				
				for(int i=0; i<N; i++) {
					
					if(song[i] != song[0]) {
						continue;
					}
					
					tmpI = i;
					
					for(int j=0; j<len; j++) {
						
						if(song[j] == song[i]) {
							if(j == len-1) {
								cnt[len-1]++;
								i = tmpI;
								break;
							}
							
							if(i == N-1) {
								i = tmpI;
								break;
							}
							else {
								i++;
								continue;
							}
						}
					}
					
					
				}
				
				len++;
			}
			
			//cnt[len] 중 제일 빠른 제일 큰 값을 가지고
			// 음의 갯수를 카운트
			int max = 0;
			int maxLen = 0;
			for(int i=0; i<N; i++) {
				if(cnt[i] >= max) {
					max    = cnt[i];
					maxLen = i + 1;
				}
			}			
			System.out.println("#"+case_no+" "+maxLen);
		}
	}
	
}