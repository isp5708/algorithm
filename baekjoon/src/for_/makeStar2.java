package for_;

import java.util.Scanner;

public class makeStar2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int tmp = s.nextInt();

		for (int i = 0; i < tmp; i++) {

			for (int j = tmp-1; j >=0; j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
