package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem10989 {

	public static void main (String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		
		int cnt,max,sum=0;
		int[] A,B,C; //초기배열,정렬된배열,계수정렬하기위한배열
		
		cnt= Integer.parseInt(bf.readLine());
		
		A=new int[cnt];
		B=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			A[i]=Integer.parseInt(bf.readLine());
		}
		
		max=A[0];
		
		for(int i=1;i<cnt;i++) {
			if(max<A[i])
				max=A[i];
		}
		
		C=new int[max+1];
		
		for(int i=0;i<cnt;i++) {
			C[A[i]]++;
		}
		
		for(int i=0;i<C.length;i++) {
			sum+=C[i];
			C[i]=sum;
		}
		
		for(int i=A.length-1;i>=0;i--) {
			B[(C[A[i]]--)-1]=A[i];
		}

		for(int i=0;i<B.length;i++) {
			System.out.println(B[i]);
		}
	}

}
