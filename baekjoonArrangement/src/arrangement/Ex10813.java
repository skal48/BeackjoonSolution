package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10813 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int bascketCnt = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		int[] bascket = new int[bascketCnt];
		
		for(int i = 0; i < bascketCnt; i++) {
			bascket[i] = i + 1;
		}		
	
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int bascketNo1 = Integer.parseInt(st.nextToken());
			int bascketNo2 = Integer.parseInt(st.nextToken());
			
			int tempBall = bascket[bascketNo1 -1];
			bascket[bascketNo1 - 1] = bascket[bascketNo2 - 1];
			bascket[bascketNo2 - 1] = tempBall;	
		}
		
		for(int i = 0; i < bascketCnt; i++) {
			System.out.print(bascket[i] + " ");
		}
	}

}
