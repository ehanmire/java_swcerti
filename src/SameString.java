import java.io.FileInputStream;
import java.util.*;

class SameString {
	
	static int T;
	
	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		
		for(int case_no=1; case_no<=T; case_no++) {
			
			String str1 = sc.next();
			String str2 = sc.next();
			
			int[] arr1 = new int[26];
			int[] arr2 = new int[26];
			
			
			//condense
			for(int i=0; i<str1.length(); i++) {
				char char_z = 'z';
				char char_in = str1.charAt(i);
				int position = 0;
				
				position = char_in - char_z + 25;
				arr1[position]++;
				
				char_in = str2.charAt(i);
				position = char_in - char_z + 25;
				arr2[position]++;
			}
			
			int Answer = 1;
			//compare
			for(int i=0; i<26; i++) {
				if(arr1[i] != arr2[i]) {
					Answer = 0;
					break;
				}
			}
			
			System.out.println("#"+case_no+" "+Answer);
		}
	}
	
}