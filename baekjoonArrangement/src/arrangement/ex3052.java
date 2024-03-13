package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex3052 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mod = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			mod[i] = Integer.parseInt(st.nextToken()) % 42;
		}
		int cnt = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = i;j < 9; j++ ) {
				if(mod[i] == mod[j+1]) {
					mod[i] = -1;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(mod[i] != -1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
