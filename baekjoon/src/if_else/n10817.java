package if_else;
import java.util.Scanner;


public class n10817 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a>b) {
			if(a>c)
				if(c>b)
					System.out.println(c);
				else
					System.out.println(b);
			else
				System.out.println(a);
		}
		else {//b>a
			if(b>c) {
				if(c>a)
					System.out.println(c);
				else
					System.out.println(a);
			}
			else
				System.out.println(b);
		}
		
		
		

	}

}
