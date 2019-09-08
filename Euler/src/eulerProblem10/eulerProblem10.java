package eulerProblem10;
/*10 ������ �Ҽ��� ��� ���ϸ� 2 + 3 + 5 + 7 = 17 �� �˴ϴ�.

�̹鸸(2,000,000) ���� �Ҽ��� ���� ���Դϱ�?*/
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
