package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem6064 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int testCaseCount,M,N,x,y,count,checkCycle;
		int startX,startY;
		String[] tmp;
		
		testCaseCount=Integer.parseInt(bf.readLine());
		
		
		for(int i=0;i<testCaseCount;i++) {
			tmp=bf.readLine().split(" ");
			M=Integer.parseInt(tmp[0]);
			N=Integer.parseInt(tmp[1]);
			x=Integer.parseInt(tmp[2]);
			y=Integer.parseInt(tmp[3]);
			count=x;
			startY=x;
			
			while(startY!=y) {
				startY+=M-N;
				if(startY<0) {
					startY=N+startY;
				}else if(startY>N) {
					startY=startY%N;
				}

				count+=M;
				
				if(startY==x) {
					count=-1;
					break;
				}
			}
			
			System.out.println(count);
		}
	}

}
