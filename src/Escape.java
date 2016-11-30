import java.io.FileInputStream;
import java.util.*;

class Escape {
	
	static int T;
	static int N;  // number of cars   1 <= N <= 1,000
	static int M;  // number of colors 1 <= N <= 50  
	
	static int[] prisnorsColor ;//= new int[10];
	static int[] passedCars ;//= new int[10];
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int case_no=1; case_no<=T; case_no++) {
			
			N = sc.nextInt();  // number of cars   1 <= N <= 1,000
			M = sc.nextInt();  // number of colors 1 <= N <= 50
			
			prisnorsColor = new int[M];
			passedCars    = new int[N];
			
			int totalCar = 0;
			for(int i=0; i<M; i++) {
				prisnorsColor[i] = sc.nextInt();
				//if(prisnorsColor[i] != 0) {
					totalCar += prisnorsColor[i];
				//}
			}
			
			
			for(int i=0; i<N; i++) {
				passedCars[i] = sc.nextInt();
			}
			
			
			// passedCar를 loop 돌면서 모든 경우의 수를 탐색한다.
			// 탐색하면서 prisnorsColor를 하나씩 감소시키고 0 미만이 나오면 통과실패임
			//   모든 배열이 0이되면 통과한 것임
			//   이 때 시작된 시점을 기록해둔 변수를 불러서 답으로 출력
			
			//checkMatch(0);
			int startNo = 0;
			//int endNo   = 0;
			 
			for(int i=0; i<N; i++) {
				startNo = findStart(i, totalCar);
				if(startNo != 0) {
					//startNo ++;
					break;
				}
			}
			System.out.println("#"+case_no+" "+startNo);
		}
	}
	
	public static int findStart (int idx, int totalCar) {
		
		int[] tmpColors = new int[prisnorsColor.length];
		System.arraycopy(prisnorsColor,0,tmpColors,0,prisnorsColor.length);
		
		int cnt = 0;
		for(int i=idx; i<N; i++) {  // passedCar
			
			int clrNo = passedCars[i];
			
			if(tmpColors[clrNo-1] >= 1) {
				tmpColors[clrNo-1]--;
				cnt++;
				// 차량 대수 등으로 마지막 차량인지를 확인해야 함
				// 확인 후 현재 번호를 return 하면 그게 마지막 번호임
				
				if(cnt == totalCar) {
					break;
				}
			}
			else {
				return 0;
			}			
		}
		
		if(cnt == totalCar) {
			return (idx+1);
		}
		else {
			return 0;
		}
	}
}