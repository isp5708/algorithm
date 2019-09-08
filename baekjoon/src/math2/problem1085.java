package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int x,y,w,h;
		int[] distanceRectangleUpDownRightLeft=new int[4];
		int minDistance;
		
		String[] tmp;
		
		tmp=bf.readLine().split(" ");
		
		x=Integer.parseInt(tmp[0]);
		y=Integer.parseInt(tmp[1]);
		w=Integer.parseInt(tmp[2]);
		h=Integer.parseInt(tmp[3]);
		
		distanceRectangleUpDownRightLeft[0]=h-y;
		distanceRectangleUpDownRightLeft[1]=y;
		distanceRectangleUpDownRightLeft[2]=w-x;
		distanceRectangleUpDownRightLeft[3]=x;
		
		minDistance=distanceRectangleUpDownRightLeft[0];
		
		for(int i=1;i<distanceRectangleUpDownRightLeft.length;i++) {
			if(distanceRectangleUpDownRightLeft[i]<minDistance)
				minDistance=distanceRectangleUpDownRightLeft[i];
		}
		
		System.out.println(minDistance);

	}

}
