package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int[] printedX=new int[3];
		int[] printedY=new int[3];
		
		int x,y,resultX,resultY,count,tmpNumber=0;
		
		String[] tmp;
		
		for(int i=0;i<printedX.length;i++) {
			tmp=bf.readLine().split(" ");
			
			printedX[i]=Integer.parseInt(tmp[0]);
			printedY[i]=Integer.parseInt(tmp[1]);
		}
		
		x=printedX[0];
		count=0;
		for(int i=1;i<printedX.length;i++) {
			if(x==printedX[i])
				count++;
			else
				tmpNumber=printedX[i];
		}
		
		if(count==0)
			resultX=x;
		else
			resultX=tmpNumber;
		
		y=printedY[0];
		count=0;
		
		for(int i=1;i<printedY.length;i++) {
			if(y==printedY[i])
				count++;
			else
				tmpNumber=printedY[i];
		}
		
		if(count==0)
			resultY=y;
		else
			resultY=tmpNumber;
		
		System.out.println(resultX+" "+resultY);

	}

}
