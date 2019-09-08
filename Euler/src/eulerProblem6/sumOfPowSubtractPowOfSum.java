package eulerProblem6;

public class sumOfPowSubtractPowOfSum {
	public static int powOfSum(int endOfNum) {
		int sum=0;
		
		for(int i=1;i<=endOfNum;i++) {
			sum+=Math.pow(i, 2);
		}
		return sum;
	}
	
	public static int sumOfPow(int endOfNum) {
		int sum=0;
		
		for(int i=1;i<=endOfNum;i++) {
			sum+=i;
		}
		
		sum=sum*sum;
		return sum;
	}

	public static void main(String[] args) {
		int endOfnum=100;
		int result=sumOfPow(endOfnum)-powOfSum(endOfnum);
		
		System.out.println(result);
	}

}
