package eulerProblem1;

public class multiplesOf3and5 {
	int endOfNumber;
	public multiplesOf3and5(int endOfNumber) {
		this.endOfNumber=endOfNumber;
	}
	public void printMultiplesOf3and5Sum() {
		int sum=0;
		for(int i=1;i<endOfNumber;i++) {
			if(i%3==0 || i%5==0)
				sum+=i;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		multiplesOf3and5 multi = new multiplesOf3and5(1000);
		multi.printMultiplesOf3and5Sum();

	}

}
