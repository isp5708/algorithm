package for_;
import java.util.Scanner;

public class makeStar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int tmp=s.nextInt();
		
		for(int i=0;i<tmp;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
