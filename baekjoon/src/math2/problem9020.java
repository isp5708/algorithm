package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem9020 {
	
	public static boolean isDecimal(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void findGoldBahParticion(int n) {
		int decimalA=0,decimalB=0,i,j;
		
		for(i=n/2 ,j=n/2;i!=1||j!=n;i--,j++) {
			if(isDecimal(i)&&isDecimal(j))
			{
				decimalA=i;
				decimalB=j;
				break;
			}
		}
		
		System.out.println(decimalA+" "+decimalB);
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cntNumber,number;
		
		cntNumber=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<cntNumber;i++) {
			number=Integer.parseInt(bf.readLine());
			findGoldBahParticion(number);
		}

	}

}
