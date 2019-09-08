package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2581 {

	public static boolean isDecimal(int number) {
		if (number == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int lowNumber, highNumber, sum = 0, cntDecimal = 0;
		double minNumber = Double.POSITIVE_INFINITY;

		lowNumber = Integer.parseInt(bf.readLine());
		highNumber = Integer.parseInt(bf.readLine());

		for (int i = lowNumber; i <= highNumber; i++) {
			if (isDecimal(i)) {
				sum += i;
				cntDecimal++;
				if (i < minNumber)
					minNumber = i;
			}
		}
		if (cntDecimal == 0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println((int) minNumber);
		}

	}

}
