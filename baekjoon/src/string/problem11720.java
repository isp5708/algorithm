package string;
import java.util.Scanner;

public class problem11720 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String tmp;
		
		int stringLength,sum=0;
		
		stringLength=s.nextInt();
		
		
		tmp=s.next();
		
		for(int i=0;i<stringLength;i++) {
			sum+=tmp.charAt(i)-'0';
		}
		
		
		System.out.println(sum);

	}

}
