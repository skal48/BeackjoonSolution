package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String wordTemp = br.readLine();
		char[] word = new char[wordTemp.length()];
		
		for(int i = 0; i < wordTemp.length(); i++) {
			word[i] = wordTemp.charAt(i);
			
		}
				
		for(int i = 0; i < 26; i++) {
			int cnt =0;
			for(int j = 0; j < word.length; j++) {
				if((char)(97 + i) == word[j] ) {
					System.out.print(j + " " );
					break;
				} 
				cnt++;
				if(cnt == word.length) {
					System.out.print(-1 + " ");
				}
				
			}
		}
		
		

	}

}
