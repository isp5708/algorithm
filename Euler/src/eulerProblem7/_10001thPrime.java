package eulerProblem7;

public class _10001thPrime {
	public static void find10001thPrime() {
		int count=0;
		for(int i=2;;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
			
			if(count==10001) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("end");
	}
	
	public static boolean isPrime(int input) {
		for(int i=2;i<input;i++) {
			if(input%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		find10001thPrime();

	}

}
