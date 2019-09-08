package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2869 {

	public static void main(String[] args)throws IOException {
		String[] tmp;
		
		int A,B,V,countDate=1,moveDistance=0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		tmp=bf.readLine().split(" ");
		
		A=Integer.parseInt(tmp[0]);
		B=Integer.parseInt(tmp[1]);
		V=Integer.parseInt(tmp[2]);
		
		if(A<V) {
			countDate+=Math.ceil(((double)V-A)/(A-B));
		}
		
		System.out.println(countDate);

	}

}
