package arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10871 {
	public static void main(String[] arg) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		StringTokenizer st1 = new StringTokenizer(br.readLine());
	    int cnt = Integer.parseInt(st1.nextToken());
	    int num = Integer.parseInt(st1.nextToken());
	    
	    int[] givenNum = new int[cnt]; 
	    StringTokenizer st2 = new StringTokenizer(br.readLine());
	    
	    for(int i = 0; i < cnt ; i++) {
	    	givenNum[i] = Integer.parseInt(st2.nextToken()); 
	    	if(givenNum[i] < num) {
	    		System.out.print(givenNum[i]+" ");
	    	}
	    }
	    
	    
	    
	}

}
