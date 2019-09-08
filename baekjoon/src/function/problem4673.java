package function;

import java.util.Arrays;

public class problem4673 {
	
	static boolean[] checkSelfNumber=new boolean[10000];
	
	public static void findSelfNumber(int num) {
		 //기본값을 참으로 초기화
		
		int tmp=num;
		int notSelfNumber;
		
		while(tmp<10000) {
			
			notSelfNumber=tmp;
			
			while(tmp!=0) {
				notSelfNumber+=tmp%10;
				tmp=tmp/10;
			}
			if(notSelfNumber<10000)
				checkSelfNumber[notSelfNumber-1]=false;
			
			tmp=notSelfNumber;
		}
	}

	public static void main(String[] args) {
		Arrays.fill(checkSelfNumber, Boolean.TRUE);
		for(int i=1;i<10000;i++) {
			if(checkSelfNumber[i-1]!=false)
				findSelfNumber(i);
		}
		
		for(int i=0;i<checkSelfNumber.length-1;i++) {
			if(checkSelfNumber[i]==true)
				System.out.println(i+1);
		}
	}

}
