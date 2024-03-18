package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11720 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String num = br.readLine();
		
		int sum = 0;
		for(int i = 0; i < cnt; i++) {
			sum += (num.charAt(i) -'0');  //ex 1일경우 49 - 48이 되기 때문에 1이 됨 
			
		}
		
		System.out.println(sum);

	}

}
