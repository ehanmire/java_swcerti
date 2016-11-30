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
			
			
			// passedCar�� loop ���鼭 ��� ����� ���� Ž���Ѵ�.
			// Ž���ϸ鼭 prisnorsColor�� �ϳ��� ���ҽ�Ű�� 0 �̸��� ������ ���������
			//   ��� �迭�� 0�̵Ǹ� ����� ����
			//   �� �� ���۵� ������ ����ص� ������ �ҷ��� ������ ���
			
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
				// ���� ��� ������ ������ ���������� Ȯ���ؾ� ��
				// Ȯ�� �� ���� ��ȣ�� return �ϸ� �װ� ������ ��ȣ��
				
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