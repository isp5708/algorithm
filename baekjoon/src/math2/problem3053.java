package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem3053 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int r;
		
		r=Integer.parseInt(bf.readLine());
		System.out.println(String.format("%.6f",r*r*Math.PI));
		System.out.println(String.format("%.6f",(double)r*r*2));
		

	}

}
