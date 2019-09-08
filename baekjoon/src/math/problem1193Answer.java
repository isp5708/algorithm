package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1193Answer  {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=0,line=0, n;
		
		n=Integer.parseInt(bf.readLine());
		
		while(cnt<n) {
			line++;
			cnt=line*(line+1)/2;
		}
		
		if(line%2==0) {
			int top,bottom;
			
			top=line-(cnt-n);
			bottom= cnt-n+1;
			
			System.out.println(top+"/"+bottom);
		}else {
			int top,bottom;
			
			top=cnt-n+1;
			bottom=line-(cnt-n);
			
			System.out.println(top+"/"+bottom);
		}

	}

}
