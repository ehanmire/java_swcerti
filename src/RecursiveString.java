
import java.io.FileInputStream;
import java.util.*;

class RecursiveString{
	
	public static void main(String args[]) throws Exception{
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
			
		for(int test_no=1; test_no<=T;test_no++){
			int len = sc.nextInt();
			String str = sc.next();
			//System.out.println(str);
			
			for(int i=0; i<len; i++){
				if(str.charAt(i)!=str.charAt(len-i-1)) {
					System.out.println("#"+test_no+" NO");
					break;
				}
				else if(i==len-1){
					System.out.println("#"+test_no+" YES");
				}
			}
		}
	}
}