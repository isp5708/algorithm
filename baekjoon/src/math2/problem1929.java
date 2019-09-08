package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1929 {

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

		int lowNumber, highNumber;
		String[] tmp;
		
		tmp=bf.readLine().split(" ");
		
		lowNumber=Integer.parseInt(tmp[0]);
		highNumber=Integer.parseInt(tmp[1]);

		for (int i = lowNumber; i <= highNumber; i++) {
			if (isDecimal(i)) {
				System.out.println(i);
			}
		}
	}

}
