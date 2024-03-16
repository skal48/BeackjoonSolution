package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex27866 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		
		st =  new StringTokenizer(br.readLine());
		
		System.out.println(s.charAt(Integer.parseInt(st.nextToken()) -1));

	}

}
