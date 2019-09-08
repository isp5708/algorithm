package eulerProblem4;

import java.util.Scanner;

public class palindrome {

	public static void findPalindrome(int digit) {// palindrome를 찾는 함수
		int num = makeLagestNumber(digit);
		System.out.println(num);
		int max=0;  //palindrome중 가장큰녀석을 담아두는 변수
		for (int i = num; i > 0; i--) {
			for (int j = num; j > 0; j--) {
				if (isPalindrome(Integer.toString(i*j))) {//palindrome인지 검사하는 함수
					if(i*j>max) 
						max=i*j;
				}
			}
		}
		System.out.println(max);
	}

	public static int makeLagestNumber(int digit) { //자리수중 가장큰수 만들어주는 값을 반환
		int num = 1;

		for (int i = 0; i < digit; i++) {
			num *= 10;
		}
		return num - 1;
	}

	public static boolean isPalindrome(String num) {
		int last = num.length() - 1;
		String[] d = num.split("");

		for (int i = 0; i < d.length / 2; i++) {
			if (!(d[i].equals(d[last--])))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("자리수 입력:");
		Scanner s = new Scanner(System.in);

		int d = s.nextInt();

		findPalindrome(d);
	}

}
