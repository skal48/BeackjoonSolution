package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Ex2562 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[9];
		for(int i =0; i < 9; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}				
		
		int max = num[0];
		int idx = 0; 
		for(int i = 0; i < 9; i++) {
			max = max > num[i] ? max : num[i];
			if(max == num[i]) {
				idx = i + 1;
			}
		}
				
		System.out.println(max);
		System.out.print(idx);
	}

}
