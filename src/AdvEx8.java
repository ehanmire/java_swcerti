import java.util.Scanner;
import java.io.FileInputStream;

class AdvEx8{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		//System.out.println(test_case);
		
		for(int i=0;i<test_case;i++){
		
			int x1,x2,x3,y1,y2,y3;
			
			x1 = sc.nextInt(); //System.out.print(x1);
			y1 = sc.nextInt(); //System.out.print(y1);
			x2 = sc.nextInt(); //System.out.print(x2);
			y2 = sc.nextInt(); //System.out.print(y2);
			x3 = sc.nextInt(); //System.out.print(x3);
			y3 = sc.nextInt(); //System.out.print(y3); System.out.println();
			
			
		}
	}
}