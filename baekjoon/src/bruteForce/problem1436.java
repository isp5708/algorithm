package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1436 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int count,n=665;
		String tmp;
		
		count=Integer.parseInt(bf.readLine());
		
		while(count>0) {
			n++;
			tmp=String.valueOf(n);
			
			if(tmp.contains("666"))
				count--;
			
			
		}
		System.out.println(n);
	}

}
