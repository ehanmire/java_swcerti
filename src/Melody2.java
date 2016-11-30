import java.util.*;
import java.io.FileInputStream;

class Melody2 {
	
    static int N;
    static int[] m = new int[3000];
    static int Answer;
	static int[] cnt = new int[3001];
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int test_case, T;		
        T = sc.nextInt();
        
        int maxMelodyLength;
        int maxMelodyCnt;
        int len;
		
		for(test_case=1; test_case<=T; test_case++) {
            N = sc.nextInt();
            
            for(int i=0; i<N; i++) {
                m[i] = sc.nextInt();
            }
            
            maxMelodyLength = 1;
            maxMelodyCnt = 1;
            
            for(int i=1; i<=N; i++) {
                cnt[i] = 1;
            }
            
            for(int i=1; i<N; i++) {
                if(m[i]==m[0]) {
                    len = 0;
                    for(int j=i; j<N; j++) {
                        if(m[len] == m[j]) {
                            cnt[len+1]++;
                            len++;
                        } else {
                        	break;
                        }
                    }
                }
            }
            for(int i=1; i<=N; i++) {
                if(cnt[i] >= maxMelodyCnt) {
                    maxMelodyCnt = cnt[i];
                    maxMelodyLength = i;
                }
            }
            
            Answer = maxMelodyLength;
            
            System.out.println("#"+test_case+" "+Answer);
        }
    }
}