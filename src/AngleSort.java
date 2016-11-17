import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileInputStream;

class AngleSort{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++){
			
			int N = sc.nextInt();
			float[][] arr = new float[N][3];
			
			for(int i=0; i<N; i++){
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
				arr[i][2] = arr[i][1] / arr[i][0];
			}
			
			Arrays.sort(arr,0,N, new Comp1());
			
			System.out.print("#"+test_case);
			for(int i=0; i<N; i++){
				System.out.print(" "+(int)arr[i][0]+","+(int)arr[i][1]);
			}
			System.out.println();
		}
	}
	
	static class Comp1 implements Comparator<float[]>{
		@Override
		public int compare(float[] arg0, float[] arg1){
			return (int) ((arg0[2] - arg1[2])*10000000);  // 여기 곱하는 scale을 어느 정도해야하나?
		}
	}
}