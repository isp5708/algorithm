package function;
import java.util.ArrayList;
import java.util.Scanner;

public class problem1065 {
	public static boolean checkHanSu(int num) {
		ArrayList<Integer> tmpArray=new ArrayList<Integer>();
		int tmp=num;
		int isometricSequence;
		int variableNumber=1;
		
		if(num<100)
			return true;

		while(tmp!=0) {
			tmpArray.add(tmp%10);
			tmp=tmp/10;
		}
		
		
		isometricSequence=tmpArray.get(1)-tmpArray.get(0);
		
		for(int i=2;i<tmpArray.size();i++) {
			if(isometricSequence!=tmpArray.get(i)-tmpArray.get(variableNumber))
				return false;
			variableNumber++;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		
		int lastNumber=s.nextInt();
		
		for(int i=1;i<=lastNumber;i++) {
			if(checkHanSu(i))
				count++;
		}
		System.out.println(count);

	}

}
