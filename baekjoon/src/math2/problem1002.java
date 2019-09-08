package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1002 {
	static int x1,y1,x2,y2,r1,r2;
	
	public static void findLocationCount() {
		int count=0;
		
		for(int i=-10000;i<=10000;i++) {
			for(int j=-10000;j<=10000;j++) {
				if((i-x1)*(i-x1)+(j-y1)*(j-y1)==r1*r1&&(i-x2)*(i-x2)+(j-y2)*(j-y2)==r2*r2)
					count++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int caseCnt;
		
		
		String[] tmp;
		
		caseCnt=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<caseCnt;i++) {
			tmp=bf.readLine().split(" ");
			
			x1=Integer.parseInt(tmp[0]);
			y1=Integer.parseInt(tmp[1]);
			r1=Integer.parseInt(tmp[2]);
			x2=Integer.parseInt(tmp[3]);
			y2=Integer.parseInt(tmp[4]);
			r2=Integer.parseInt(tmp[5]);
			
			if(x1==x2&&y1==y2&&r1==r2) {
				System.out.println("-1");
			}else if(x1==x2&&y1==y2&&r1!=r2) {
				System.out.println("0");
			}else {
				findLocationCount();
			}
		}

	}

}
