package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2675 {
	public static void main(String[] arg) throws Exception {	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int cnt = Integer.parseInt(br.readLine());
		 
		 String[] pocket = new String[2 * cnt];
		 for(int i = 0; i < 2 * cnt; i += 2) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 pocket[i] = st.nextToken();
			 pocket[i + 1] = st.nextToken();
			 
		 }
		 for(int j = 0; j < pocket.length; j += 2 ) {
			 for(int i = 0; i < pocket[j + 1].length(); i++) {
				 int temp = 0;
				 while(temp <  Integer.parseInt(pocket[j])) {
					 System.out.print(pocket[j+1].charAt(i));
					 temp++;
				 }
				 
			 }
			 System.out.println();
		 }
				 
	}

}
