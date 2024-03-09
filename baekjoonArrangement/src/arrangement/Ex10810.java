package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10810 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int bascketCnt = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		int[] bascket = new int[bascketCnt];
		for(int i = 0; i < cnt; i++){
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			for(int j = first; j <= last; j++ ) {
				bascket[j-1] = ball;
			}
			
		}
		
		for(int i = 0; i < bascketCnt; i++) {
			System.out.print(bascket[i] + " ");
		}

	}

}
