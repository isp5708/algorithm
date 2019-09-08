package for_;
import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		int number;
		
		Scanner s=new Scanner(System.in);
		
		number=s.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(number+" * "+i+" = "+i*number);
		}

	}

}
