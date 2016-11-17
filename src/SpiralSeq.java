import java.io.FileInputStream;
import java.util.*;

class SpiralSeq{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		for(int case_no = 1; case_no <=T; case_no++){
			
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
					
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			
			int step, step_size, step_done, step_judge, step_sum;
			int mid, x, y;
			String direction, isTurn; //UP, RI, DN, LE
			int noTurn;
			
			System.out.print("#"+case_no);
			
			// Init condition
			step       = 1;
			step_size  = 1;
			step_judge = 1;
			step_sum   = 0;
			isTurn     = "N";
			noTurn     = 1;
			direction  = "UP";
			mid        = (N / 2); //System.out.print(mid);
			x          = mid;
			y          = mid;
			
			while(step <= (N*N)) {
				
				// Print
				System.out.print(" "+arr[x][y]);

				if(isTurn == "Y"){
					if      (direction == "UP") {direction = "RI";}
					else if (direction == "RI") {direction = "DN";}
					else if (direction == "DN") {direction = "LE";}
					else if (direction == "LE") {direction = "UP";}
					isTurn = "N";
				}								
				// Move				
				if      (direction == "UP") {x = x - 1;}
				else if (direction == "RI") {y = y + 1;}
				else if (direction == "DN") {x = x + 1;}
				else if (direction == "LE") {y = y - 1;}
				step_sum++;
				
				//Find Next Direction
				if (step_sum >= step_size){
					isTurn = "Y";
					step_sum = 0;
					if(noTurn == 2){
						noTurn=1;
						step_size++;
					}
					else {
						noTurn++;
					}
				}
				
				
				step++;
			}
			System.out.println();

		}
	}
	

	

}