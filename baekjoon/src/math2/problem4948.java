package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem4948 {
	
	public static boolean isDecimal(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNumber=-1,n,cntDecimal;
		
		ArrayList<Integer> tmpArray=new ArrayList<Integer>();
		
		while(inputNumber!=0) {
			inputNumber=Integer.parseInt(bf.readLine());
			
			tmpArray.add(inputNumber);
		}
		
		for(int i=0;i<tmpArray.size()-1;i++) {
			cntDecimal=0;
			for(int j=tmpArray.get(i)+1;j<=tmpArray.get(i)*2;j++) {
				if(isDecimal(j))
					cntDecimal++;
			}
			System.out.println(cntDecimal);
		}

	}

}
