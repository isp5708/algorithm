package eulerProblem10;
/*10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.

이백만(2,000,000) 이하 소수의 합은 얼마입니까?*/
public class eulerProblem10 {
	public static boolean isDecimal(long number) {
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void decimalOfSum(long lastNumber) {
		long sum=0;
		for(long i=2;i<=lastNumber;i++) {
			if(isDecimal(i)) {
				sum+=i;
				System.out.println(i);
			}
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		decimalOfSum(2000000);

	}

}
