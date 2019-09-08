package eulerProblem2;
import java.util.ArrayList;

public class febEvenSum {
	int sum=0;
	
	public int fibo(int input) {
		if(input==1)
			return 1;
		else if(input==2)
			return 2;
		else 
			return fibo(input-1)+fibo(input-2); 
	}
	
	public void checkEvenAnd4MillionLow() {
		int i=1;
		
		while(fibo(i)<=4000000) {
			if(fibo(i)%2==0)
				sum+=fibo(i);
			
			i++;
		}
	}
	
	public static void main(String[] args) {
		febEvenSum f = new febEvenSum();
		
		f.checkEvenAnd4MillionLow();
		
		System.out.println(f.sum);
	}

}
