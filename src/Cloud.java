import java.io.FileInputStream;
import java.util.*;

class Cloud {
	
	static int T, H, W;
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();		
		
		for(int case_no=1; case_no<=T; case_no++) {
			
			H = sc.nextInt();
			W = sc.nextInt();
			
			int[][] cloud = new int[H][W];
			
			// 기본 공간을 -1로 업데이트
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					cloud[i][j] = -1;
				}
			}
			
			// 구름이 있는 곳은 0
			for(int i=0; i<H; i++) {
				String str = sc.next();
				for(int j=0; j<W; j++) {
					if(str.charAt(j) == 'c') {
						cloud[i][j] = 0;
					}
				}
			}
			
			// 왼쪽에 구름이 얼마나 떨어져 있는지 체크
			for(int i=0; i<H; i++) {
				for(int j=1; j<W; j++) {
					
					if(cloud[i][j] == 0) {
						continue;
					}
					for(int k=j-1; k>=0; k--) {
						if(cloud[i][k] == 0) {
							cloud[i][j] = (j - k);
							break;
						}
					}
				}
			}			
			
			// 출력
			System.out.print("#"+case_no);
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					System.out.print(" "+cloud[i][j]);
				}
				System.out.println();
			}
		}
	}
	

}