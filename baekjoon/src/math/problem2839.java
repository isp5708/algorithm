package math;
import java.util.Arrays;
import java.util.Scanner;
public class problem2839 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int sugalKg,a=3,b=5;
		
		sugalKg=s.nextInt();

		int min5,min3,coinMin5,coinMin3;
		double minNumberOfCoin;
		
		min5=sugalKg/5;
		
		min3=sugalKg/3;
		
		double[][] coinNumberOfCase=new double[min5+1][min3+1];
		
		for(int i=0;i<coinNumberOfCase.length;i++) {
			for(int j=0;j<coinNumberOfCase[0].length;j++) {
				coinNumberOfCase[i][j]=Double.POSITIVE_INFINITY;
			}
		}
		
		for(int i=0;i<coinNumberOfCase.length;i++) {
			for(int j=0;j<coinNumberOfCase[0].length;j++) {
				if(5*i+j*3==sugalKg)
					coinNumberOfCase[i][j]=i+j;
			}
		}
		
		minNumberOfCoin=Double.POSITIVE_INFINITY;
		// 1За 2ї­
		for(int i=0;i<coinNumberOfCase.length;i++) {
			for(int j=0;j<coinNumberOfCase[0].length;j++) {
				if(coinNumberOfCase[i][j]<minNumberOfCoin)
					minNumberOfCoin=coinNumberOfCase[i][j];
			}
		}
		
		if(minNumberOfCoin==Double.POSITIVE_INFINITY)
			System.out.println("-1");
		else
			System.out.println((int)minNumberOfCoin);
		

	}

}
