package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex9086 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[] temp = new String[cnt];
		for(int i = 0; i < cnt; i++) {
			temp[i] = br.readLine();
			
		}
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(temp[i].charAt(0)+""+temp[i].charAt(temp[i].length()-1));
		}
	}

}
