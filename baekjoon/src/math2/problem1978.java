package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1978 {
	
	public static boolean isDecimal(int number) {
		if(number==1)
			return false;
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cntNumber,cntDecimal=0;
		
		String[] tmp;
		
		cntNumber=Integer.parseInt(bf.readLine());
		
		tmp=bf.readLine().split(" ");
		
		for(int i=0;i<cntNumber;i++) {
			if(isDecimal(Integer.parseInt(tmp[i])))
				cntDecimal++;
		}
		System.out.println(cntDecimal);

	}

}
