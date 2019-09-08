package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1002Answer {
	static int x1,y1,x2,y2,r1,r2;

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int caseCnt;
		double distance;
		
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
			
			distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
			
			if(distance==0) {
				if(r1==r2)
					System.out.println("-1");
				else
					System.out.println("0");
			}else {
				
				if(distance>r2+r1)
					System.out.println("0");
				else if(distance==r1+r2)
					System.out.println("1");
				else if(distance<r1+r2) {
					if(r1<r2&&r1+distance==r2) {
						System.out.println("1");
					}else if(r2<r1&&r2+distance==r1) {
						System.out.println("1");
					}else if(r1<r2&&r1+distance<r2) {
						System.out.println("0");
					}else if(r2<r1&&r2+distance<r1) {
						System.out.println("0");
					}else {
						System.out.println("2");
					}
				}
			}
		}

	}

}
