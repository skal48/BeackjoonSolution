package geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1002 {
	
	 public static void main(String[] args) throws Exception {
		 BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int cnt = Integer.parseInt(br.readLine());
		 int[] result = new int[cnt]; 
		 
		 for(int i = 0; i < cnt; i++) {
			 int[] location = new int[6];
			 StringTokenizer st = new StringTokenizer(br.readLine()," ");
			 for(int j = 0; j < 6; j++) {
				 location[j] = Integer.parseInt(st.nextToken());
			 }
			 
			 double a = Math.sqrt(Math.pow(location[0]-location[3], 2)+Math.pow(location[1]-location[4], 2));
			 double b = location[2]+location[5];
			 if(a == b){
				 result[i] = 1; 
			 }else if(location[0]==location[3] && location[1]==location[4]&&(location[2]>location[5] || location[2] < location[5])){
				 result[i] = 0;
			 }else if(a > b) {
				 result[i] = 0;
			 }
			 else if(a < b) {
				 result[i] = 2;
			 }else if(location[0]==location[3] && location[1]==location[4]&&location[2]==location[5]) {
			 	result[i] = -1;
			 }
		 }
		 
		 for(int answer: result) {
			 System.out.println(answer);
		 }
			 
			 
			 
			 
			 
			 
		 
	 }

}
