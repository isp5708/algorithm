package for_;

import java.util.Scanner;

public class sum {
	public static int sum(int number) {
		if(number==1)
			return 1;
		else
			return number+sum(number-1);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println(sum(s.nextInt()));

	}

}
