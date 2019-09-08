package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1011 {
	static int inputCase;
	static int[] start;
	static int[] end;
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		String tmp;
		String[] tmpArray;
		
		inputCase=Integer.parseInt(bf.readLine());
		
		long dist,k; //전체거리, 최대속도
		
		start=new int[inputCase];
		end=new int[inputCase];
		
		for(int i=0;i<inputCase;i++) {
			tmp=bf.readLine();
			tmpArray=tmp.split(" ");
			
			start[i]=Integer.parseInt(tmpArray[0]);
			end[i]=Integer.parseInt(tmpArray[1]);
			
			dist=end[i]-start[i];
			
			k=0;
			
			while(true) {
				k++;
				if(dist-k*k<=0)
					break;
			}
			if(dist-k*k==0)
				System.out.println(k*2-1);
			else {
				k=k-1;
				if(dist-k*k<=k)
					System.out.println(k*2);
				else
					System.out.println(k*2+1);
			}
			
		}
		
		

	}

}
