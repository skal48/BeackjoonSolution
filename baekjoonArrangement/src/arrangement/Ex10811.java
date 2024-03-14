package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10811 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int basketCnt = Integer.parseInt(st.nextToken());
		int[] basket = new int[basketCnt];
		int cnt = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < basketCnt; i++) {
			basket[i] = i + 1;
		}
		
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			int[] temp = new int[last];
			for(int j = first, k = last; j <= last; j++) {
				temp[j -1] = basket[k - 1];
				k--;
			}
			for(int j = first; j <= last; j++) {
				basket[j -1] = temp[j -1];
			}
			
		}
		
		for(int i = 0; i < basketCnt; i++) {
			System.out.print(basket[i] + " ");
		}
		

	}

}
