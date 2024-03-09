package arrangement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex10807 {

	public static void main(String[] args) throws Exception{
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String temp = br.readLine();
	    int cn = Integer.parseInt(temp);
	    int[] getCn = new int[cn];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    for(int i = 0; i < cn ; i++) {
	    	getCn[i] = Integer.parseInt(st.nextToken()); 
	    }
	    
	    int findNo = Integer.parseInt(br.readLine()); 
	    int count = 0;
	    for(int i = 0; i < cn ; i++) {
	    	if(getCn[i] == findNo) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    
	    br.close();
	    bw.flush();
	    bw.close();
	  }

}
