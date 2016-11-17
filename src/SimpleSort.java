import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class SimpleSort{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		int size;
		
		for(int i=1;i<=test_case;i++){
			
			size = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int j=0; j<size; j++){
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr, 0, size);
			
			System.out.print("#"+test_case+" ");
			for(int j=0; j<size; j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}
}