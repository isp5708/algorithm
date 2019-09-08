package function;

import java.util.ArrayList;
import java.util.Scanner;

public class problem11729 {
	static int count=0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void hanoi(int org,int tmp,int to,int n) {
		if(n==1)
			sb.append(org+" "+to+"\n");
		else
		{
			hanoi(org,to,tmp,n-1);
			sb.append(org+" "+to+"\n");
			hanoi(tmp,org,to,n-1);
			
		}
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n;
		
		n=s.nextInt();
		
		hanoi(1,2,3,n);
		
		sb.insert(0, count+"\n");
		
		System.out.println(sb);

	}

}
