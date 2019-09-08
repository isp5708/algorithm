package math;

import java.util.Scanner;

public class problem2292 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int input, addNumber = 0, startNumber = 1, count = 1;

		input = s.nextInt();
		if (input == 1)
			System.out.println(count);
		else {
			while (startNumber < input) {
				addNumber += 6;
				startNumber += addNumber;
				count++;
			}
			System.out.println(count);
		}

	}

}
