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
			
			//add x : 1�� ������ ���� x�� ���Ѵ�
			//add   : 1�� ������ 2�� ������ ���ؼ� 1�� ������ �����Ѵ�.
			//mul x : 1�� ������ ���� x�� ���Ѵ�
			//mul   : 1�� ������ 2�� ������ ���ؼ� 1�� ������ �����Ѵ�.
			//rotate D C : D�� 0 or 1, C�� 1~9
			//
			//             D�� 1�̸� K�� ���� ���� K+C�� ������ ���� (K�� 1~10)
			//             K+C�� 10���� ũ�� 11���� 1��, 12���� 2���� ������ ����
			//
			//             D�� 0�̸� K�� ���� ���� K-C�� ������ ����
			//             K-C�� 1���� ������ 0�̸� 10��, -1�̸� 9�� � ����
			
			
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