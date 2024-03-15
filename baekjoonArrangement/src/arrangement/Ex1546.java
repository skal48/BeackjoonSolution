package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt =  Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] score = new int[cnt];
		int maxScore = 0;
		Double total = 0.0;
		for (int i = 0; i < cnt; i++) {
			int temp = Integer.parseInt(st.nextToken());
			score[i] = temp;
			maxScore = maxScore > temp ? maxScore : temp;
			total = total + temp;
		}
		
		System.out.println(String.format("%.3f", total/cnt/maxScore * 100));
		
		
		
	}

}
