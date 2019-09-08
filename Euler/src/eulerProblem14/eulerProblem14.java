package eulerProblem14;

public class eulerProblem14 {
	
	public static long hailStoneSequenceCount(long number) {
		int count=0;
		
		while(number!=1) {
			if(number%2==0) {
				number=number/2;
			}
			else {
				number=number*3+1;
			}
			count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		long number=1000000;
		long maxCountNumber=number;
		long count=hailStoneSequenceCount(number);
		System.out.println(count+" "+maxCountNumber);
		number--;
		while(number>=1) {
			if(hailStoneSequenceCount(number)>count) {
				count=hailStoneSequenceCount(number);
				maxCountNumber=number;
			}
			System.out.println(maxCountNumber);
			number--;
		}
		System.out.println(count+" "+maxCountNumber);
		

	}

}
