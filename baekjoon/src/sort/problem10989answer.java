package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem10989answer {

	public static void main (String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt,max=0,tmp;
		int[] B,C; //�ʱ�迭,���ĵȹ迭,��������ϱ����ѹ迭
		
		cnt= Integer.parseInt(bf.readLine());
		
		C=new int[10000+1];
		
		for(int i=0;i<cnt;i++) {
			tmp=Integer.parseInt(bf.readLine());
			C[tmp]++;
			if(max<tmp)
				max=tmp;
		}
		
		for(int i=0;i<max+1;i++) {
			if(C[i]!=0) {
				for(int j=0;j<C[i];j++) {
					bw.write(i+"\n");
				}
			}
		}
		bw.close();
	}

}
