package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class problem4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		
		int[] traingleLength=new int[3];
		String[] tmp;
		
		while(true) {
			tmp=bf.readLine().split(" ");
			
			a.add(Integer.parseInt(tmp[0]));
			b.add(Integer.parseInt(tmp[1]));
			c.add(Integer.parseInt(tmp[2]));
			
			if(a.get(a.size()-1)==0) {
				break;
			}
		}
		
		
		
		for(int i=0;i<a.size()-1;i++) {
			traingleLength[0]=a.get(i);
			traingleLength[1]=b.get(i);
			traingleLength[2]=c.get(i);
			
			Arrays.sort(traingleLength);
			
			if(Math.pow(traingleLength[0], 2)+Math.pow(traingleLength[1], 2)==Math.pow(traingleLength[2], 2))
			{
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}

	}

}
