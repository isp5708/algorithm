package eulerProblem4;

import java.util.Scanner;

public class palindrome {

	public static void findPalindrome(int digit) {// palindrome�� ã�� �Լ�
		int num = makeLagestNumber(digit);
		System.out.println(num);
		int max=0;  //palindrome�� ����ū�༮�� ��Ƶδ� ����
		for (int i = num; i > 0; i--) {
			for (int j = num; j > 0; j--) {
				if (isPalindrome(Integer.toString(i*j))) {//palindrome���� �˻��ϴ� �Լ�
					if(i*j>max) 
						max=i*j;
				}
			}
		}
		System.out.println(max);
	}

	public static int makeLagestNumber(int digit) { //�ڸ����� ����ū�� ������ִ� ���� ��ȯ
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
		System.out.println("�ڸ��� �Է�:");
		Scanner s = new Scanner(System.in);

		int d = s.nextInt();

		findPalindrome(d);
	}

}
