package function;

import java.util.Arrays;
import java.util.Scanner;

public class problem2447 {
	static char[][] d;

	public static void ruleOfFunction(int x, int y, int number) {
		if (number == 1) {
			d[x][y] = '*';
			return;
		}

		int div = number / 3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					;
				else
					ruleOfFunction(x + (div * i), y + (div * j), div);
			}
		}

	}

	public static void answerDinamicProgramming(int number) {

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				int x,y;
				x=i;
				y=j;
				
				while(x!=0) {
					if(x%3==1&&y%3==1)
						break;
					
					x/=3;
					y/=3;
				}
				if(x==0)
					d[i][j]='*';
				else
					d[i][j]=' ';
			}
		}

	}

	public static void main(String[] args) {
		int line;
		Scanner s = new Scanner(System.in);

		line = s.nextInt();

		d = new char[line][line];

		for (int i = 0; i < line; i++) {
			Arrays.fill(d[i], ' ');
		}

		//ruleOfFunction(0, 0, line);
		answerDinamicProgramming(line);
		for (int i = 0; i < line; i++) {
			System.out.println(d[i]);
		}

	}

}
