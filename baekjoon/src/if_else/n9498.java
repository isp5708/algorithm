package if_else;
import java.util.Scanner;

public class n9498 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int testScore;
		
		testScore=s.nextInt();
		
		if(testScore>=90) {
			System.out.println("A");
		}else if(testScore>=80) {
			System.out.println("B");
		}else if(testScore>=70) {
			System.out.println("C");
		}else if(testScore>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
