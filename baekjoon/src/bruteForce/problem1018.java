package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problem1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int m,n,result,countA,countB,count;
		Double minCount=Double.POSITIVE_INFINITY;
		String[][] chessBoard;
		String[] tmp;

		tmp=bf.readLine().split(" ");
		
		n=Integer.parseInt(tmp[0]);
		m=Integer.parseInt(tmp[1]);
		 
		chessBoard=new String[n][m];
		
		for(int i=0;i<n;i++) {
			tmp=bf.readLine().split("");
			for(int j=0;j<tmp.length;j++) {
				chessBoard[i][j]=tmp[j];
			}
		}
		
		for(int a=0;a<=n-8;a++) { //8*8���� �� �� ��ŭ �󸶳��������������ϴ���
			for(int b=0;b<=m-8;b++) {
				countA=0;
				countB=0;
				//8*8 ���� ���� ��ó���ϴ°����˻�
				for(int i=a;i<a+8;i++) {
					for(int j=b;j<b+8;j++) {
						
							if(i%2==0) {//���� ¦���Ͻ�{
								if(j%2==0) {//���� ¦���Ͻ�
									if(!chessBoard[i][j].equals("W"))
										countA++;
								}else {
									if(!chessBoard[i][j].equals("B"))
										countA++;
								}
							}else {//���� Ȧ���Ͻ�
								if(j%2==0) {//���� ¦���Ͻ�
									if(!chessBoard[i][j].equals("B"))
										countA++;
								}else {
									if(!chessBoard[i][j].equals("W"))
										countA++;
								}
							}
						
							if(i%2==0) {//���� ¦���Ͻ�{
								if(j%2==0) {//���� ¦���Ͻ�
									if(!chessBoard[i][j].equals("B"))
										countB++;
								}else {
									if(!chessBoard[i][j].equals("W"))
										countB++;
								}
							}else {//���� Ȧ���Ͻ�
								if(j%2==0) {//���� ¦���Ͻ�
									if(!chessBoard[i][j].equals("W"))
										countB++;
								}else {
									if(!chessBoard[i][j].equals("B"))
										countB++;
								}
							}
						
					}
				}
				
				count=countA>countB?countB:countA;
				if(count<minCount)
					minCount=Double.valueOf(count);
				
				
			}
		}
		System.out.println(minCount.intValue());
		
		
	}

}
