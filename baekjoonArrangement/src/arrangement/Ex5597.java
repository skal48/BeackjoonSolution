package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5597 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] student = new int[30];
		
		for(int i = 0; i < 30; i++) {
			student[i] = i + 1;
		}
		int first = 0;
		int second = 0;
		for(int i = 0; i < 28; i++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int reportNo = Integer.parseInt(st.nextToken());
		    for(int j = 0; j < 30; j++) {
		    	if(student[j] == reportNo) { 
		    		student[j] = 0; 
		    		}
		    }
		    
		}    
		
		for(int i = 0; i < 30; i++) {
			if(student[i] != 0)
			System.out.println(student[i]);
		}
		
	}

}
