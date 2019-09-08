package i_oArithmeticOperations;
import java.util.Scanner;

public class multi {

	public static void main(String[] args) {
		String a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		b=s.nextLine();
		for(int i=b.length()-1;i>=0;i--) {
			System.out.println(Integer.parseInt(a)*Character.getNumericValue(b.charAt(i)));
		}
		System.out.println(Integer.parseInt(a)*Integer.parseInt(b));

	}

}
