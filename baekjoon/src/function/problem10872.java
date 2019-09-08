package function;
import java.util.Scanner;


public class problem10872 {
	public static int fac(int n) {
		int mul=1;
		
		while(n>0) {
			mul*=n;
			n--;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int inputNumber;
		
		inputNumber=s.nextInt();
		
		System.out.println(fac(inputNumber));

	}

}
