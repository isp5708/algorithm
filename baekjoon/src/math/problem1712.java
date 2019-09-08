package math;

import java.util.Scanner;

public class problem1712 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int priceA, priceB, priceC, result, count = 0;

		priceA = Integer.parseInt(s.next());
		priceB = Integer.parseInt(s.next());
		priceC = Integer.parseInt(s.next());

		if (priceB >= priceC) {
			System.out.println("-1");
		} else {
			count=priceA/(priceC-priceB)+1;

			System.out.println(count);
		}

	}

}
