package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class problem2750 {
	static int[] tmp;
	public static void swap(int i,int j) {
		int t;
		
		t=tmp[i];
		
		tmp[i]=tmp[j];
		tmp[j]=t;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		
		int cnt,min;
		
		cnt=Integer.parseInt(bf.readLine());
		
		tmp=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			tmp[i]=Integer.parseInt(bf.readLine());
		}
		
		for(int i=0;i<cnt;i++) {
			min=i;
			
			for(int j=i;j<cnt;j++) {
				if(tmp[min]>tmp[j])
					min=j;
			}
			
			swap(i,min);
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.print(tmp[i]+" ");
		}
	}

}
