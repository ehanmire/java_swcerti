import java.io.FileInputStream;
import java.util.*;

class Calcurator{
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		String tmpT = sc.nextLine();
		int T = Integer.parseInt(tmpT);
		
		
		for(int case_no=1; case_no<=T; case_no++){
			
			String tmpNoOfOrders = sc.nextLine();
			int noOfOrders = Integer.parseInt(tmpNoOfOrders);
			
			//add x : 1번 변수에 정수 x를 더한다
			//add   : 1번 변수와 2번 변수를 더해서 1번 변수에 저장한다.
			//mul x : 1번 변수에 정수 x를 곱한다
			//mul   : 1번 변수와 2번 변수를 곱해서 1번 변수에 저장한다.
			//rotate D C : D는 0 or 1, C는 1~9
			//
			//             D가 1이면 K번 변수 값이 K+C번 변수에 저장 (K는 1~10)
			//             K+C가 10보다 크면 11번은 1번, 12번은 2번수 등으로 저장
			//
			//             D가 0이면 K번 변수 값이 K-C번 변수에 저장
			//             K-C가 1보다 작으면 0이면 10번, -1이면 9번 등에 저장
			
			
			String[] orders = new String[noOfOrders];
			int[] arr       = new int[10];
			int[] tmpArr    = new int[10];
			
			for(int i=0; i<noOfOrders; i++){
				
				orders[i] = sc.nextLine();
				//System.out.println(orders[i]);
				
				String[] ord = orders[i].split(" ");
				
				switch(ord[0]) {
					case "add":
						if(ord.length >= 2) {
							arr[0] = arr[0] + Integer.parseInt(ord[1]);
						}
						else {
							arr[0] = arr[0] + arr[1];
						}
						continue;
					case "mul":
						if(ord.length >= 2) {
							arr[0] = arr[0] * Integer.parseInt(ord[1]);
						}
						else {
							arr[0] = arr[0] * arr[1];
						}
						continue;
					case "rotate":
						int arg1 = Integer.parseInt(ord[1]);
						int arg2 = Integer.parseInt(ord[2]);
						//System.out.println("111" + ord[1] + "222");
						
						if(arg1 == 1) {
							arg2 = arg2 * -1;
						}
						
						for(int j=0; j<10; j++) {
							int shifedPosition = j + arg2;
							
							if (shifedPosition>9) {
								shifedPosition = shifedPosition - 10;
							}
							else if (shifedPosition<0) {
								shifedPosition = shifedPosition + 10;
							}
							
							tmpArr[j] = arr[shifedPosition];
						}
						for(int j=0; j<10; j++) {
							arr[j] = tmpArr[j];
						}
						//continue;
				}
			}
			
			System.out.print("#"+case_no);
			for(int j=0; j<10; j++) {
				System.out.print(" "+arr[j]);
			}
			System.out.println();
		}
	}
}