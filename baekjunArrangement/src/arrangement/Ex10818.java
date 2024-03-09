package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10818 {

	public static void main(String[] args) throws Exception {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(bw.readLine());
		StringTokenizer st = new StringTokenizer(bw.readLine());
		
		int[] num = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i <cnt; i++) {
			
				max = max > num[i] ? max : num[i] ;
				min = min < num[i] ? min : num[i];
				
			
	
		}
		
		
		System.out.println(min + " " + max);
	}

}
