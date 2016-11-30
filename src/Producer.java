import java.io.FileInputStream;
import java.util.*;

class Producer{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int case_no=1; case_no<=T; case_no++){

			int N      = sc.nextInt();
			int V      = sc.nextInt();
			
			int[] score = new int[N];
			int[] vote  = new int[V];
			
			for(int i=0; i<V; i++){
				vote[i] = sc.nextInt();
			}
			
			int postVoteNo = 0;
			int plusScore  = 0;
			
			for(int i=0; i<V; i++){
				
				if(i==0){
					score[vote[i]-1]++;
					postVoteNo = vote[i];
				}
				else {
					if(postVoteNo==vote[i]){
						plusScore++;
					}
					else{
						plusScore = 0;
					}
					
					score[vote[i]-1] = score[vote[i]-1] + plusScore + 1;
				}
				postVoteNo = vote[i];
			}
			
			int tmpScore = score[0];
			int winnerNo = 1;
			
			for(int i=1; i<N; i++){
				if(tmpScore<score[i]){
					winnerNo = i+1; 
					tmpScore = score[i];
				}
			}
			
			System.out.println("#"+case_no+" "+winnerNo);
		}
	}
}