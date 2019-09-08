package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2775 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int testCaseCount,k,n;// 케이스 횟수, k층 , n호
		int[][] tmpArray;
		
		testCaseCount=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<testCaseCount;i++) {
			k=Integer.parseInt(bf.readLine());
			n=Integer.parseInt(bf.readLine());
			
			tmpArray=new int[k+1][n]; //n호는 1호부터시작
			
			for(int j=0;j<n;j++) {
				tmpArray[0][j]=j+1;
			}
			
			for(int j=0;j<=k;j++) {
				tmpArray[j][0]=1;
			}
			
			for(int j=1;j<=k;j++) {
				for(int t=1;t<n;t++) {
					tmpArray[j][t]=tmpArray[j-1][t]+tmpArray[j][t-1];
				}
			}
			
			for(int j=0;j<tmpArray.length;j++) {
				for(int t=0;t<tmpArray[0].length;t++) {
					System.out.print(tmpArray[j][t]+" ");
				}
				System.out.println();
			}
			
			System.out.println(tmpArray[k][n-1]);
			
		}

	}

}
