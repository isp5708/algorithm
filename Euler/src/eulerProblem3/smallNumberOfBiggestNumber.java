package eulerProblem3;

import java.util.ArrayList;

public class smallNumberOfBiggestNumber {
	ArrayList<Long> smallNumber;
	long number;
	
	public smallNumberOfBiggestNumber(long number) {
		smallNumber=new ArrayList<Long>();
		this.number=number;
	}
	
	public void makeSmallNumber1() {
		long multi=1L;
		
		for(long i=2;i<=number/2;i++) {
			if(number%i==0) 
				multi*=i;
			if(multi==number) {
				System.out.println(i);
				break;
			}
		}
	}
	public void makeSmallNumber2() {
		for(long i=2;i<=number/2;i++) {
			if(number%i==0 && checkDecimal(i))
				smallNumber.add(i);
			
			if(smallNumberMultiCheck())
				break;
		}
	}
	
	public boolean checkDecimal(long inputNum) {
		int count=0;
		
		for(long i=2;i<=inputNum/2;i++) {
			if(inputNum%i==0)
				count++;
		}
		
		if(count==0)
			return true;
		else
			return false;
		
	}
	
	public boolean smallNumberMultiCheck() {
		long multi=1L;
		for(int i=0;i<smallNumber.size();i++) {
			multi*=smallNumber.get(i);
		}
		if(multi==number)
			return true;
		else
			return false;
		
	}
	
	public void printSmallNumber() {
		for(int i=0;i<smallNumber.size();i++) {
			System.out.println(smallNumber.get(i));
		}
	}

	public static void main(String[] args) {
		smallNumberOfBiggestNumber problem =new smallNumberOfBiggestNumber(600851475143L);
		
		problem.makeSmallNumber1();
		
		//problem.makeSmallNumber2();
		
		//problem.printSmallNumber();
		
		//System.out.println(problem.smallNumber.get(problem.smallNumber.size()-1));

	}

}
